package red.lixiang.springstudy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import red.lixiang.springstudy.model.TestBean;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		TestBean testBean = (TestBean) context.getBean("testBean");
		testBean.sayHello();
		System.out.println(testBean);
	}
}
