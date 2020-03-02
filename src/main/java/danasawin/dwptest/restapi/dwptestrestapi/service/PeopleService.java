package danasawin.dwptest.restapi.dwptestrestapi.service;

import java.util.List;

import danasawin.dwptest.restapi.dwptestrestapi.model.People;

public interface PeopleService {
	
	List <Object> getAllPeople();
	
	List<People> getLondonPeople(double longitude, double latitude);
	
	List<People> getPeopleWithin50MilesOfLondon();

}
