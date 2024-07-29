package study;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {
	
	public static void sendEmail(String fromEmail, String title, String content) {
		
		//������ ���� ���� ����
		final String adminEmail="junga_121@naver.com";
		final String password="CSTJH8UNEBTK";
		
		//������ �̸��� ȯ�漳�� ���
		Properties prop=new Properties();
		prop.put("mail.smtp.host", "smtp.naver.com"); //smtp ������
		prop.put("mail.smtp.port", "587"); //smtp ��Ʈ��ȣ
		prop.put("mail.smtp.starttls.enable", "true"); //tls ��뿩��
		prop.put("mail.smtp.auth", "true"); //smtp ���� ����
		
		//���Ǳ� ��Ͻ� ������ �̸��Ϸ� ����
		//������ ����� �޴� ��� �ʿ�
		//������ ����� Ŭ���̾�Ʈ���� ���� Ŭ���̾�Ʈ ���Ͽ��� �߼۵��� �ʰ�
		//�ڹٿ��� �߼��ϴ� ���̱� ������ �����ڰ� ������ �޾ƾ� ��
		Session adminAuth=Session.getInstance(prop,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(adminEmail,password);
					}
				}
			); //������ �̸��� �α��� ����
		
		try {
			MimeMessage msg=new MimeMessage(adminAuth);
			msg.setFrom(new InternetAddress(adminEmail)); //������ �̸��� �ּ�
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(adminEmail)); //�޴� �̸��� �ּ�
			
			msg.setHeader("Content-type", "text/html;charset=utf-8");
			
			msg.setSubject("���� �� ���["+title+"]-"+fromEmail); //�̸��� ����
			
			msg.setContent( //�̸��� ����
						"<h3>���� ����</h3> <b>"+content+
						"</b> <div> <a href='http://localhost:8080/jsp_study1/study/?part=inquiry'>"+"���Ǳ� Ȯ��</a> </div>"
					, "text/html;charset=utf-8");
			
			Transport.send(msg); //���� ����
			
		}catch(MessagingException e) {
			e.printStackTrace();
			System.out.println("�̸��� ���� ����");
		}
		
	}
	
}