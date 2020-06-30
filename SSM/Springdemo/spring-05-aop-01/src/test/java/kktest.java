import com.ori.service.UserServieImpl;
import com.ori.service.Userservice;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author OriKey
 * @create 2020- 06- 29 9:14
 * -- 平凡才是唯一的答案 --
 **/
public class kktest {
    @Test
    public void test(){
        int a = 1;
        a++;
        System.out.println("a=:" +a);
    }
    @Test
    public void test_My(){
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationConfig.xml");
        //动态代理的是接口
        Userservice userService = (Userservice)context.getBean("userService");
        userService.add();
    }
}
