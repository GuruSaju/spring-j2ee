package guru.springsecurityanotation.configuration;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
/**
 * 
 * @author Srisarguru
 *
 */
/*
 * Equivalent to 
 * <filter>
	<filter-name>springSecurityFilterChain</filter-name>
	<filter-class>org.springframework.web.filter.DelegatingFilterProxy
                </filter-class>
</filter>

<filter-mapping>
	<filter-name>springSecurityFilterChain</filter-name>
	<url-pattern>/*</url-pattern>
</filter-mapping>

in web.xml
 */
//will load the springsecuirtyFilter chain automatically
public class SpringSecurityInitializer extends AbstractSecurityWebApplicationInitializer {
/*	public SpringSecurityInitializer() {
		super(SecurityConfiguration.class);
	}*/
}
