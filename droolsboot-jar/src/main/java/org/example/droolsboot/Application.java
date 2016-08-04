package org.example.droolsboot;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		KieServices ks = KieServices.Factory.get();
		KieSession session = ks.newKieClasspathContainer().newKieSession();
		session.insert("123456");
		session.fireAllRules();
		session.dispose();
	}
}
