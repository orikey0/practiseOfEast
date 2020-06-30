import com.OriKey.mybatis.mapper.UserMapper;
import com.OriKey.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author OriKey
 * @create 2020- 06- 29 15:46
 * -- 平凡才是唯一的答案 --
 **/
public class MyTest {
    @Test
    public void test() throws IOException {
        String res = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(res);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession(true);
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User>userList = mapper.selectUser();
        for (User user:userList){
            System.out.println(user);
        }
    }
    @Test
    public void test_mapper() throws IOException{
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        for (User user:userMapper.selectUser()){
            System.out.println(user);
        }
    }

    @Test
    public void test_UserMapper_2(){
        ApplicationContext context
                 = new ClassPathXmlApplicationContext("applicationContext.xml" +
                "");
        UserMapper userMapper = (UserMapper) context.getBean("userMapper2");
        for (User user:userMapper.selectUser()){
            System.out.println(user);
        }
    }
}






















