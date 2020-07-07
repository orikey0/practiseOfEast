import com.Mapper.StudentMapper;
import com.Mapper.TeacherMapper;
import com.pojo.Student;
import com.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author OriKey
 * @create 2020- 07- 07 21:12
 * -- 平凡才是唯一的答案 --
 **/
public class MyTest {
    SqlSession sqlSession ;
    StudentMapper studentMapper;
    TeacherMapper teacherMapper;
    public MyTest(){
        sqlSession = SqlSessionUtil.GetSqlSession();
        studentMapper = sqlSession.getMapper(StudentMapper.class);
        teacherMapper = sqlSession.getMapper(TeacherMapper.class);
    }
    @Test
    public void test_GetTeacher(){
        System.out.println(teacherMapper.getTeacher(1));
    }
}
