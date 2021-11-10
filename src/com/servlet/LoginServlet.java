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
 * 实现用户登录
 *使用servlet接口提供的HttpServlet类,需要重写其中的doGet和doPost方法
 * HttpServlet类:读取Http请求的内容,响应Web客户请求
 */
public class LoginServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        /*将信息使用doPost方法执行   对应jsp页面中的form表单中的method*/
        doPost(request,response);
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        /*获取jsp页面传过来的参数*/
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        UserDao ud=new UserDaoImpl();
        if(ud.login(username,password)){
            /*用户名,密码匹配,登录成功,转发到成功页面*/
            request.setAttribute("message","欢迎回家!"+username);
            request.getRequestDispatcher("success.jsp").forward(request,response);
        }
        else{
            /*否则,登录失败,重定向到首页*/
            response.sendRedirect("index.jsp");
        }
    }
}
