package com.dao;

import com.connect.DBConnect;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.entity.User;

/**
 * @author Administrator
 * 实现UserDao接口
 */
public class UserDaoImpl implements UserDao{
    @Override
    public boolean register(User user){
        boolean flag=false;
        DBConnect.connect();
        String sql="insert into user(username,password,sex,phone,email)"+
                "values('"+user.getUsername()+"','"+user.getPassword()+"','"+user.getSex()+"','"+user.getPhone()+"','"+user.getEmail()+"')";
        if(DBConnect.addUpdateDelete(sql)>0){
            flag=true;
        }
        DBConnect.closeConnect();
        return flag;
    }
    @Override
    public boolean login(String username, String password){
        boolean flag=false;
        try{
            DBConnect.connect();
            String sql="select*from user where username='"+username+"' and password='"+password+"'";
            ResultSet rs=DBConnect.findSql(sql);
            while(rs.next()){
                if(rs.getString("username").equals(username)&&rs.getString("password").equals(password)){
                    flag=true;
                }
            }
            DBConnect.closeConnect();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return flag;
    }
    @Override
    public List<User> getUserAll(){
        List<User> list=new ArrayList<User>();
        try{
            DBConnect.connect();
            String sql="select*from user";
            ResultSet rs=DBConnect.findSql(sql);
            while(rs.next()){
                User user=new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setSex(rs.getString("sex"));
                user.setPhone(rs.getString("phone"));
                user.setEmail(rs.getString("email"));
                list.add(user);
            }
            DBConnect.closeConnect();
            return list;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public boolean update(String username, String password, String sex, String phone, String email){
        boolean flag=false;
        DBConnect.connect();
        String sql="update user set password='"+password+"',sex='"+sex+"',phone='"+phone+"',email='"+email+"' where username="+username;
        if(DBConnect.addUpdateDelete(sql)>0){
            flag=true;
        }
        DBConnect.closeConnect();
        return flag;
    }
    @Override
    public boolean delete(String username){
        boolean flag=false;
        DBConnect.connect();
        String sql="delete from user where username="+username;
        if(DBConnect.addUpdateDelete(sql)>0){
            flag=true;
        }
        DBConnect.closeConnect();
        return flag;
    }
}
