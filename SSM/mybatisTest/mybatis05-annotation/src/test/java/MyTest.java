import com.mapper.UserMapper;
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
    public void test_sle(){
        for (User user : userMapper.getUsers()) {
            System.out.println(user);
        }
    }
    public void finalize(){
        sqlSession.close();
    }
}
