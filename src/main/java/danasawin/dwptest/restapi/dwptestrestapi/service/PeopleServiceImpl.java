package danasawin.dwptest.restapi.dwptestrestapi.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import danasawin.dwptest.restapi.dwptestrestapi.model.People;

@Service
public class PeopleServiceImpl implements PeopleService {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<Object> getAllPeople() {
		String url = "https://bpdts-test-app.herokuapp.com/users";
		Object[] peoples = restTemplate.getForObject(url, Object[].class);
		return Arrays.asList(peoples);
	}

	@Override
	public List<People> getLondonPeople(double latitude, double longitude) {
		String url = "https://bpdts-test-app.herokuapp.com/users";
		People[] peoples = restTemplate.getForObject(url, People[].class);

		for (People obj : peoples)
			if ((obj.getLatitude() == latitude && obj.getLongitude() == longitude)) {
				return Arrays.asList(obj);
			}
		return Arrays.asList(peoples);
	}

	@Override
	public List<People> getPeopleWithin50MilesOfLondon(double lat1, double lat2, double long1, double long2) {
		String url = "https://bpdts-test-app.herokuapp.com/users";
		People[] peoples = restTemplate.getForObject(url, People[].class);
		return Arrays.asList(peoples);
	}

}
