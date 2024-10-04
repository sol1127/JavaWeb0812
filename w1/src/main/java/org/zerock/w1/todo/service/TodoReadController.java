package org.zerock.w1.todo.service;

import org.zerock.w1.HelloServlet;
import org.zerock.w1.todo.dto.TodoDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="todoReadController", value="/todo/read")
public class TodoReadController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("/todo/read");
        // 한개의 데이터를 취득할 수 있도록 Primary Key 값을 받음
        Long tno = Long.parseLong(req.getParameter("tno"));
        // TodoService 를 이용하여 한개의 데이터를 취득
        TodoDTO dto = TodoService.INSTANCE.get(tno);
        // TodoDTO 를 dto 라는 이름으로 request 에 저장
        req.setAttribute("dto", dto);
        // read.jsp 를 실행
        req.getRequestDispatcher("/WEB-INF/todo/read.jsp").forward(req, resp);
    }
}
