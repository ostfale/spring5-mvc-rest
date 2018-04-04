package guru.springframework.controllers.v1;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Abstract test class
 * Created : 04.04.2018
 *
 * @author : usauerbrei
 */
public abstract class AbstractRestControllerTest {

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
