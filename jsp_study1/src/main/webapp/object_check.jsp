<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h2>객체 적용 범위 확인</h2>
request객체 → name: <%=request.getAttribute("name")%><br>
<%-- request: 페이지 이동시 사라짐 --%>
session객체 → age: <%=session.getAttribute("age") %><br>
<%-- session: 브라우저 재시작시 사라짐 --%>
application객체 → job: <%=application.getAttribute("job") %>
<%-- application: 서버 재시작시 사라짐 --%>