import com.mapper.StudentMapper;
import com.mapper.UserMapper;
import com.pojo.Student;
import com.pojo.User;
import com.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author OriKey
 * @create 2020- 07- 06 20:50
 * -- 平凡才是唯一的答案 --
 **/

public class MyTest {
    SqlSession sqlSession;
    UserMapper userMapper;
    public MyTest(){
        sqlSession = MyBatisUtil.getSqlSeesion();
        userMapper =  sqlSession.getMapper(UserMapper.class);
    }
    @Test
//    查询全部数据
    public void test_selectAll(){
        for (User user : userMapper.userList()) {
            System.out.println(user);
        }
    }

//    模糊查询
    @Test
    public void test_like(){
        for (User user : userMapper.getUserByName("lih")) {
            System.out.println(user.toString());
        }
    }
    @Test
    public void test_insert(){
        userMapper.addUser(new User(6,"李厚华","22是"));
        sqlSession.commit();
    }
    @Test
    public void test_delete(){
        userMapper.deleteUserById(6);
        sqlSession.commit();
    }
    @Test
    public void test_update(){
        userMapper.updateUser(new User(5,"李厚华","李厚华"));
        sqlSession.commit();
    }

    @Test
    public void test_getStudent(){
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        for (Student student : studentMapper.getStudent()) {
            System.out.println(student);
        }
    }
    public void finalize(){
        sqlSession.close();
    }
}
