package com.busan501.helloworld;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

    @WebServlet(name = "myServlet" , urlPatterns = "/my") //이름은 중복되면 안됨
    public class Myservlet extends HttpServlet {

        @Override
        protected  void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();

            out.println("<html><body>");
            out.println("<h1>Hello </h1>");
            out.println("</body></html>");

        }
}
