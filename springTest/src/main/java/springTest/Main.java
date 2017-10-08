package springTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ConfigClass;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigClass.class);
		String stringBean = ctx.getBean(String.class);
		System.out.println(stringBean);
	}

}
