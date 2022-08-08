package config;

import org.springframework.context.annotation.Bean;

import springTest.Client;
import springTest.Client2;

public class AppCtx {
	@Bean(initMethod = "connect", destroyMethod = "close")
	public Client2 client2() {
		Client2 client2 = new Client2();
		client2.setHost("host");
		return client2;
	}
	@Bean
	public Client client() {
		Client client = new Client();
		client.setHost("host");
		return client;
	}

}
