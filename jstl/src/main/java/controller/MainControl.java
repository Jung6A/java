package controller;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.ResourceBundle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MainActive;
import service.Memberjoin;

/**
 * Servlet implementation class MainControl
 */
@WebServlet("/MainControl")
public class MainControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private HashMap<String , MainActive> map = new HashMap<>();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		ResourceBundle rb = ResourceBundle.getBundle("class_bundle/mainProp");
		Enumeration key = rb.getKeys();
		while( key.hasMoreElements() ) {
			String k = (String)key.nextElement(); // signup.do , signIn.do ....
			String value =rb.getString(k); // service.MemberJoin 
			
			try {
					Class<?> hcl = Class.forName(value);
					MainActive his = (MainActive)hcl.newInstance(); // 객체 생성
					map.put(k, his);
				
			}catch(Exception e) {
				System.out.println("mainProp 파일 Map변환 실패");
			}
			
			
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doMethod(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doMethod(request, response);
	}
	
	protected void doMethod(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8"); // 요청 시 입력 값에 대한 인코딩
		
		String uri = request.getRequestURI(); // 사용자가 요청한 주소
		// uri :  /signup.do
		
		String cmd = uri.substring( uri.lastIndexOf("/")+1 );
		// cmd : signup.do
		
		String view="/"; // 사용자가 보는 뷰페이지
		
		MainActive target = map.get(cmd); // 요청 주소에 맞는 클래스 객체 가져오기
		view = target.action(request, response);
		
		if(view !=null) {
			RequestDispatcher rd = request.getRequestDispatcher(view);
			rd.forward(request, response);
		}
		
	}

}
/*
 		if( cmd.equals("signup.do") ) { // 회원가입 양식 페이지 이동
			if( request.getMethod().equals("POST")   ) {   // request.getMethod() : 사용자 요청방식
				MemberJoin save = new MemberJoin();
				save.join(request, response);
			}else {
				view ="member/signup.html";
			}
		}else if( cmd.equals("signin.do") ) { //로그인 양식 페이지 이동
			
			view = "member/signin.jsp";
		}
 */