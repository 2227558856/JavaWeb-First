package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.UserDao;
import com.dao.UserDaoImpl;

/**
 * @author Administrator
 * 删除用户
 */
public class DeleteServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        doPost(request,response);
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        String username=request.getParameter("username");
        UserDao ud=new UserDaoImpl();
        if(ud.delete(username)){
            request.setAttribute("message","删除成功");
            request.getRequestDispatcher("GetAllServlet").forward(request,response);
        }
        else{
            response.sendRedirect("index.jsp");
        }
    }
}
