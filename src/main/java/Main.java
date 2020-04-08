import brans.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext fileSystemXmlApplicationContext = new ClassPathXmlApplicationContext("springContext.xml");
        UserDao userDao =  fileSystemXmlApplicationContext.getBean(UserDao.class);
        userDao.save();
    }
}
