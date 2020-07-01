import org.junit.Test;

/**
 * @author OriKey
 * @create 2020- 07- 01 17:40
 * -- 平凡才是唯一的答案 --
 **/
public class Mytest {
    @Test
    public void test(){
        try {
            Class.forName("0com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
