package org.zerock.w1;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

// Servlet : 요청을 받아 데이터를 취득하거나 저장한 후 화면을 돌려주는 역할을 하는 공간
// name =  서블릿의 이름 (다른 서블릿과 중복되지 않는 이름 설정하기)
// value = 도메인/value 값 : servlet 요청할 때 사용하는 주소의 값
@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        // html 파일에 작성할 내용을 적는 기능
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        // html 파일에 <html><body>내용을 추가하는 기능
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}