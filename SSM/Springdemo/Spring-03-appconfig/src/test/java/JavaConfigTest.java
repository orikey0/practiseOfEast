import com.config.JavaConfig;
import com.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author OriKey
 * @create 2020- 06- 18 21:20
 * -- 平凡才是唯一的答案 --
 **/
public class JavaConfigTest {
    @Test
    public void test(){
        ApplicationContext context =
            new AnnotationConfigApplicationContext(JavaConfig.class);
        User user = context.getBean("getUser",User.class);

        System.out.println(user.getName());

    }
}
