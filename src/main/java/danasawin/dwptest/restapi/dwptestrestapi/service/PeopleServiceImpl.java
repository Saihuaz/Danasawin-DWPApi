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
		People people = restTemplate.getForObject(url, People.class);
		double londonLatitude = 51.509865;
		double londonLongitude = -0.118092;
		if ((latitude == londonLatitude) && (longitude == londonLongitude)) {
			return Arrays.asList(people);
		} else {

			return null;
		}
	}

	@Override
	public List<People> getPeopleWithin50MilesOfLondon() {
		return null;
	}

}
