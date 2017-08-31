package guru.spring.pagination.controllernconfiguration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 
 * @author Srisarguru
 *
 */
public class SpringWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class[] getServletConfigClasses() {
		return new Class[] { SpringWebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	@Override
	protected Class[] getRootConfigClasses() {
		return new Class[] {};
	}

}
