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
		
		//관리자 메일 계정 설정
		final String adminEmail="junga_121@naver.com";
		final String password="CSTJH8UNEBTK";
		
		//관리자 이메일 환경설정 등록
		Properties prop=new Properties();
		prop.put("mail.smtp.host", "smtp.naver.com"); //smtp 서버명
		prop.put("mail.smtp.port", "587"); //smtp 포트변호
		prop.put("mail.smtp.starttls.enable", "true"); //tls 사용여부
		prop.put("mail.smtp.auth", "true"); //smtp 서버 인증
		
		//문의글 등록시 관리자 이메일로 전송
		//보내는 사람과 받는 사람 필요
		//보내는 사람은 클라이언트지만 실제 클라이언트 메일에서 발송되지 않고
		//자바에서 발송하는 것이기 때문에 관리자가 보내고 받아야 함
		Session adminAuth=Session.getInstance(prop,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(adminEmail,password);
					}
				}
			); //보내는 이메일 로그인 인증
		
		try {
			MimeMessage msg=new MimeMessage(adminAuth);
			msg.setFrom(new InternetAddress(adminEmail)); //보내는 이메일 주소
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(adminEmail)); //받는 이메일 주소
			
			msg.setHeader("Content-type", "text/html;charset=utf-8");
			
			msg.setSubject("문의 글 등록["+title+"]-"+fromEmail); //이메일 제목
			
			msg.setContent( //이메일 내용
						"<h3>문의 내용</h3> <b>"+content+
						"</b> <div> <a href='http://localhost:8080/jsp_study1/study/?part=inquiry'>"+"문의글 확인</a> </div>"
					, "text/html;charset=utf-8");
			
			Transport.send(msg); //메일 전송
			
		}catch(MessagingException e) {
			e.printStackTrace();
			System.out.println("이메일 전송 실패");
		}
		
	}
	
}
