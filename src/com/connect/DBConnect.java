package com.connect;

import java.sql.*;

/**
 * @author Administrator
 * 数据库连接操作和数据库相关的异常处理
 */
public class DBConnect {
    static String url="jdbc:mysql://localhost:3306/webproject?&useSSL=false&serverTimezone=UTC";
    static String username="CaoQian";
    static String password="cq2227558856";
    static Connection conn=null;
    static PreparedStatement ps=null;
    static ResultSet rs=null;
    public static void connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(url,username,password);
        }catch (Exception e){
            System.out.println("SQL驱动程序初始化失败!");
            e.printStackTrace();
        }
    }
    public static int addUpdateDelete(String sql){
        int i=0;
        try{
            PreparedStatement ps=conn.prepareStatement(sql);
            i=ps.executeUpdate();
        }catch (SQLException e){
            System.out.println("SQL数据库增删改异常!");
            e.printStackTrace();
        }
        return i;
    }
    public static ResultSet findSql(String sql){
        try{
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery(sql);
        }catch (SQLException e){
            System.out.println("SQl数据库查询异常!");
            e.printStackTrace();
        }
        return rs;
    }
    public static void closeConnect(){
        try{
            conn.close();
        }catch (SQLException e){
            System.out.println("SQL数据库关闭异常!");
            e.printStackTrace();
        }
    }
}
