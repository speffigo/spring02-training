package com.springframework.learnspringframework;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class Business {

	Dependency1 dependency1;

	Dependency2 dependency2;

	/*Field-based Dependency
	 
	 @Autowired
	Dependency1 dependency1;
	
	@Autowired
	Dependency2 dependency2;
	
	public String toString() {
		return "using" + dependency1 + "from" + dependency2;
	}*/

	/* Constructor-based
	 
	  public Business(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Constructor-Depen");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	 */

	/*Setter-based
	 @Autowired
	public void setDependency1(Dependency1 dependency1) {
		System.out.println("setdependency1");
		this.dependency1 = dependency1;
	}
	
	//@Autowired
	public void setDependency2(Dependency2 dependency2) {
		System.out.println("setdependency2");
		this.dependency2 = dependency2;
	}
	 
	 */

}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan("com.springframework.learnspringframework")
public class ModifiedGamingAppSpring {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(ModifiedGamingAppSpring.class)) {
			//context.getBean(GameRunner.class).run();
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			//System.out.println(context.getBean(Business.class));
		}

	}

}
