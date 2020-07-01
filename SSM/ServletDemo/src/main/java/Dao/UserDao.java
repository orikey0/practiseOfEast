package Dao;

import Pojo.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author OriKey
 * @create 2020- 07- 01 16:03
 * -- 平凡才是唯一的答案 --
 **/
public class UserDao {
    public UserDao(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://127.0.0" +
                        ".1:3306/mybatis?characterEncoding=UTF-8", "root",
                "lihouhua");
    }
    public int getTotal() {
        int total = 0;
        try (Connection c = getConnection(); Statement s = c.createStatement();) {

            String sql = "select count(*) from user ";

            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                total = rs.getInt(1);
            }

            System.out.println("total:" + total);

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return total;
    }

    public void add(User user) {

        String sql = "insert into user values(?,?,?)";
        try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement(sql);) {

            ps.setObject(1, user.id);
            ps.setObject(2, user.name);
            ps.setObject(3, user.pwd);
            

            ps.execute();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                user.id = id;
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    public void update(User user) {

        String sql = "update user set name= ?, pwd = ? where id = ?";
        try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement(sql);) {

            ps.setObject(1, user.name);
            ps.setObject(2, user.pwd);


            ps.execute();

        } catch (SQLException e) {

            e.printStackTrace();
        }

    }

    public void delete(int id) {

        try (Connection c = getConnection(); Statement s = c.createStatement();) {

            String sql = "delete from user where id = " + id;

            s.execute(sql);

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    public User get(int id) {
        User user = null;

        try (Connection c = getConnection(); Statement s = c.createStatement();) {

            String sql = "select * from user where id = " + id;

            ResultSet rs = s.executeQuery(sql);

            if (rs.next()) {
                user = new User();
                String name = rs.getString("name");
                String pwd = rs.getString("pwd");

                user.name = name;
                user.pwd = pwd;

                user.id = id;
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return user;
    }

    public List<User> list() {
        return list(0, Short.MAX_VALUE);
    }

    public List<User> list(int start, int count) {
        List<User> users = new ArrayList<User>();

        String sql = "select * from user order by id desc limit ?,? ";

        try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement(sql);) {

            ps.setInt(1, start);
            ps.setInt(2, count);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                User user = new User();
                int id = rs.getInt(1);
                String name = rs.getString("name");
                String pwd = rs.getString("pwd");
                user.id = id;
                user.name = name;
                user.pwd = pwd;
                users.add(user);
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return users;
    }
}
