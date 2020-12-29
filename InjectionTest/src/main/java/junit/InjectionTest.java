package junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


import static org.assertj.core.api.Assertions.*;


import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;

import com.test.injection.service.injectionTestService;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/appServlet/applicationContext_mock.xml" })
public class InjectionTest {
	
	@Autowired
	private injectionTestService injectionTestService;

	@Test
	public void main() {
		injectionTestService.injectionTest("ggg");
		assertThat(injectionTestService.injectionTest("하이")).isEqualTo("결과값 : 하이");
		
//		System.out.println(returnMsg);
	}
}
