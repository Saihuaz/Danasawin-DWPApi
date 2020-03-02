package danasawin.dwptest.restapi.dwptestrestapi.service;

import static org.mockito.Mockito.*;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import danasawin.dwptest.restapi.dwptestrestapi.controller.PeopleController;

public class PeopleControllerTest {
	
	private PeopleController peopleController;
	private RestTemplate restTemplate;
	private PeopleService peopleService;
	
	@Before
	public void setUp() {
		peopleService = mock (PeopleServiceImpl.class);
		restTemplate = mock (RestTemplate.class);
		peopleController = new PeopleController(peopleService);
	}
	
	@After
	public void collector() {
		peopleController = null;
	}
	
	@Test
	public void test_GetAllPeople_CallsPeopleServiceImpl_GetForObjectOnce() {
		@SuppressWarnings("unused")
		List<Object> getAllPeople = peopleService.getAllPeople();
		String url = "https://bpdts-test-app.herokuapp.com/users";
		verify(restTemplate, times(1)).getForObject(url, Object.class);
		verifyNoMoreInteractions(restTemplate);
		
		
	}

}
