
import com.wy.pojo.User;
import com.wy.service.UserService;
import com.wy.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userServiceImpl");
        List<User> users = userService.selectUsers();
        for(User user:users){
            System.out.println(user);
        }
    }

}
