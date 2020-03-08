package danasawin.dwptest.restapi.dwptestrestapi.service;

import java.util.List;

import danasawin.dwptest.restapi.dwptestrestapi.model.People;

public interface PeopleService {
	
	List <Object> getAllPeople();
	
	List<People> getLondonPeople(double latitude, double longitude);
	
	List<People> getPeopleWithin50MilesOfLondon(double lat1,double lat2, double long1, double long2);

}
