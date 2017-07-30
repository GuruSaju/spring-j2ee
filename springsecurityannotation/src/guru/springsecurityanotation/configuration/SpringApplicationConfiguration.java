package guru.springsecurityanotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.access.SecurityConfig;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * 
 * @author Srisarguru
 *
 */
/*
 * Equivalent to
 * <context:component-scan base-package="guru.springsecurityannotation.controller" />

<bean
	class="org.springframework.web.servlet.view.InternalResourceViewResolver">
	<property name="prefix">
		<value>/WEB-INF/pages/</value>
	</property>
	<property name="suffix">
		<value>.jsp</value>
	</property>
</bean>

in dispatcher-servlet.xml
 */
@EnableWebMvc
@Configuration
@ComponentScan({ "guru.springsecurityanotation.controller" })
@Import({ SecurityConfiguration.class }) //equivalent to loading the spring-xml in web.xml
public class SpringApplicationConfiguration extends WebMvcConfigurerAdapter {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver
                          = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	@Override
	  public void addViewControllers(ViewControllerRegistry registry) {
	    registry.addViewController("/").setViewName("index.html");
	  }
}
