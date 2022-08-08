package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppCtx;
import springTest.Client;
import springTest.Client2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		Client client = ctx.getBean("client",Client.class);
		Client2 client2 = ctx.getBean("client2",Client2.class);
		client.send();
		client2.send();
		
		ctx.close();
		
	}

}
