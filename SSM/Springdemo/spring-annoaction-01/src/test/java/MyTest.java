import com.pojo.User;
import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author OriKey
 * @create 2020- 06- 18 20:40
 * -- 平凡才是唯一的答案 --
 **/
public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("user",User.class);
        System.out.println(user.getName());
    }
}
