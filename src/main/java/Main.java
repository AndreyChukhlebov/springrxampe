import brans.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext fileSystemXmlApplicationContext = new ClassPathXmlApplicationContext("springContext.xml");
        MyBean myBean =  fileSystemXmlApplicationContext.getBean(MyBean.class);
        myBean.dooo();
    }
}
