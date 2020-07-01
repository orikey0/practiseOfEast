package JDBCTest;

import org.ietf.jgss.Oid;
import org.junit.Test;

import java.sql.*;

/**
 * @author OriKey
 * @create 2020- 07- 01 10:25
 * -- 平凡才是唯一的答案 --
 **/
public class JDBC_test {

    private Statement statement;
    private Connection connection;
    public JDBC_test() throws ClassNotFoundException,
            SQLException {

        //载入utf-8
        Class.forName("com.mysql.cj.jdbc.Driver");
        //url
        String url = "jdbc:mysql://localhost:3306/mybatis?useUnicode=true" +
                "&characterEncoding=utf-8";
        String user = "root";
        String pwd = "lihouhua";
        //建立链接
        connection =DriverManager.getConnection(url,user,pwd);
//        System.out.println(connection);
        statement = connection.createStatement();
    }

    @Test
    public void test_insert(){
//        insert操作
        String insert = "insert into user value (4,'liujunjie','liujunjie')";

        try {
            statement.executeUpdate(insert);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    @Test
    public void test_update(){
//        update操作
        String sql = "update user set name = ? , pwd= ? where id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1, "junjieliu");
            preparedStatement.setObject(2, "junjieliu");
            preparedStatement.setObject(3, "4");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
