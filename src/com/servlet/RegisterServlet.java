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
 * 实现用户注册
 */
public class RegisterServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        doPost(request,response);
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        /*获取jsp页面传过来的参数*/
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String sex=request.getParameter("sex");
        String phone=request.getParameter("phone");
        String email=request.getParameter("email");
        /*将数据存入user*/
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setSex(sex);
        user.setPhone(phone);
        user.setEmail(email);
        /*将数据存入后台*/
        UserDao ud=new UserDaoImpl();
        if(ud.register(user)){
            /*注册成功,转发到登录页面*/
            request.setAttribute("message","注册成功");
            request.getRequestDispatcher("success.jsp").forward(request,response);
        }
        else{
            /*注册失败,重定向到首页*/
            response.sendRedirect("index.jsp");
        }
    }
}
