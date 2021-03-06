package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.entity.User;

/**
 * @author Administrator
 * 获取数据库中所有用户数据
 */
public class GetAllServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        doPost(request,response);
    }
    @Override
    public  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        UserDao ud=new UserDaoImpl();
        List<User> userAll=ud.getUserAll();
        request.setAttribute("userAll",userAll);
        request.getRequestDispatcher("/ShowAll.jsp").forward(request,response);
    }
}
