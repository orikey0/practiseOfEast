import com.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author OriKey
 * @create 2020- 06- 17 20:17
 * -- 平凡才是唯一的答案 --
 **/
public class MyTest {
    @Test
    public void test(){
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Person person = context.getBean("person",Person.class);
        person.getDog().shout();
        person.getCat().shout();
    }
}
