package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MemberDAO;

public class Signin implements MainActive {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		
		if(request.getSession().getAttribute("user")!=null) { //�α��� ������ ���
			request.getSession().removeAttribute("user"); //user ���� ����
		}else { //�α��� �õ�
			String id=request.getParameter("userId");
			String pw=request.getParameter("userPassword");
			
			//�����ͺ��̽����� ���̵𡤺�й�ȣ ��ȸ
			MemberDAO dao=new MemberDAO();
			boolean isSuccess=dao.login(id,pw);
			if(isSuccess) {
				request.getSession().setAttribute("user", id);
			}
		}
		
		try {
			response.sendRedirect("/");
		}catch(Exception e) {
			
		}
		
		return null;
	}

}