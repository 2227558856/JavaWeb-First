package com.dao;

import java.util.List;
import com.entity.User;

/**
 * @author Administrator
 * 用户操作接口
 */
public interface UserDao {
    /**
     * 注册
     * @param user 输入注册信息
     * @return 返回是否注册(写入数据库)成功
     */
    public boolean register(User user);

    /**
     * 登录
     * @param username 输入用户名
     * @param password 输入密码
     * @return 返回是否匹配
     */
    public boolean login(String username,String password);

    /**
     * 获取用户数据集合
     * @return 返回列表用户数据
     */
    public List<User> getUserAll();

    /**
     * 更新
     * @param username 根据用户名进行更新(用户名无法更新)
     * @param password 输入要更新的密码
     * @param sex 输入要更新的性别
     * @param phone 输入要更新的手机号
     * @param email 输入要更新的邮箱
     * @return 返回是否更新成功
     */
    public boolean update(String username,String password,String sex,String phone,String email);

    /**
     * 删除
     * @param username 输入用户名
     * @return 返回是否删除成功
     */
    public boolean delete(String username);
}
