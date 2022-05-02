package kr.co.ezenac.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import kr.co.ezenac.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// test1();
		// test2();
		//test3();
		test4();
	}

	// beanFactory - 패키지 내부(beans.xml)
	public static void test1() {
		ClassPathResource res = new ClassPathResource("kr/co/ezenac/config/beans.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		TestBean t1 = factory.getBean("t1", TestBean.class);
		System.out.printf("t1 : %s\n", t1);

		TestBean t2 = factory.getBean("t1", TestBean.class);
		System.out.printf("t2 : %s\n", t2);

		// 같은 값이 나옴 : 새로 안만들었따
		// 동일객체를 생성할땐 새로 안만든다
	}

	// BeanFactory-패키지 외부(beans.xml)
	public static void test2() {
		FileSystemResource res = new FileSystemResource("beans.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);

		TestBean t1 = factory.getBean("t2", TestBean.class);
		System.out.printf("t1 : %s\n", t1);

		TestBean t2 = factory.getBean("t2", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
		
	}

	// ApplicationCentext - 패키지 내부
	public static void test3() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/ezenac/config/beans.xml");
		System.out.printf("ctx :%s\n", ctx);

		TestBean t1 = ctx.getBean("t1", TestBean.class);
		System.out.printf("t1 : %s\n", t1);

		TestBean t2 = ctx.getBean("t1", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
		
		ctx.close();

	}

	// ApplicationCentext - 패키지 외부
	public static void test4() {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");

		TestBean t1=ctx.getBean("t2",TestBean.class);
		System.out.printf("t1 : %s\n", t1);
		TestBean t2=ctx.getBean("t2",TestBean.class);
		System.out.printf("t2 : %s\n", t2);
		
		ctx.close();
	}

}
