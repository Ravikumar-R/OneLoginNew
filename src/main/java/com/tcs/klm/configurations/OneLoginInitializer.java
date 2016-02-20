/**
 * 
 */
package com.tcs.klm.configurations;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author Ravi
 *
 */

public class OneLoginInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext container) {
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(OneLoginConfiguration.class);

		container.addListener(new ContextLoaderListener(rootContext));

		ServletRegistration.Dynamic dispatcher = container.addServlet(
				"dispatcher", new DispatcherServlet(rootContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
	}
}
