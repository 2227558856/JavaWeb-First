package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.entity.User;

/**
 * @author Administrator
 * 更新用户数据
 */
public class UpdateServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        doPost(request,response);
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String sex=request.getParameter("sex");
        String phone=request.getParameter("phone");
        String email=request.getParameter("email");
        System.out.println("----------------更新中-------------------");
        UserDao ud=new UserDaoImpl();
        if(ud.update(username,password,sex,phone,email)){
            request.setAttribute("message","更新成功");
            request.getRequestDispatcher("/GetAllServlet").forward(request,response);
        }
        else{
            response.sendRedirect("index.jsp");
        }
    }
}
