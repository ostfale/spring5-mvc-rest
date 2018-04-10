package guru.springframework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger Configuration class
 * Calling Swagger-UI : localhost:8080/swagger-ui.html
 * Created : 09.04.2018
 *
 * @author : usauerbrei
 */
@EnableSwagger2
@Configuration
//public class SwaggerConfig extends WebMvcConfigurationSupport {
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build()
				.pathMapping("/");
	}

	// use this if not in  spring boot project
	/*@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("swagger-ui.html")
				.addResourceLocations("classpath:/META-INF/resources");
		registry.addResourceHandler("/webjars/**")
				.addResourceLocations("classpath:/META-INF/resources/webjars");
	}*/
}
