package guru.springsecurityanotation.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 
 * @author Srisarguru
 *
 */
/*
 * Equivalent to spring-security.xml file
 * <http auto-config="true">
	<intercept-url pattern="/admin*.spring" access="ROLE_ADMIN" />
	<intercept-url pattern="/dba.spring" access="ROLE_ADMIN,ROLE_OTHER" />
</http>

<authentication-manager>
  <authentication-provider>
    <user-service>
	<user name="guru" password="guru" authorities="ROLE_USER" />
	<user name="admin" password="admin" authorities="ROLE_ADMIN" />
	<user name="other" password="other" authorities="ROLE_OTHER" />
    </user-service>
  </authentication-provider>
</authentication-manager>
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	  auth.inMemoryAuthentication().withUser("guru").password("guru").roles("USER");
	  auth.inMemoryAuthentication().withUser("admin").password("isadmin").roles("ADMIN");
	  auth.inMemoryAuthentication().withUser("other").password("isother").roles("OTHER");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//admin.spring can be accesed only by admin //other.spring can be accessed by admin and other
	  http.authorizeRequests()
		.antMatchers("admin.spring").access("hasRole('ROLE_ADMIN')") 
		.antMatchers("*/other.spring").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_OTHER')") 
		.and().formLogin();

	}
}
