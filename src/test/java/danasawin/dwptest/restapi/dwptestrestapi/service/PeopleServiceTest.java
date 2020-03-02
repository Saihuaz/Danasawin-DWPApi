package danasawin.dwptest.restapi.dwptestrestapi.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import danasawin.dwptest.restapi.dwptestrestapi.model.People;

public class PeopleServiceTest {

	public static final double LATITUDE_BOUND = 51.509865;
	public static final double LONGITUDE_BOUND = -0.118092;

	private PeopleServiceImpl peopleServiceImpl;

	@Before
	public void setUp() {
		peopleServiceImpl = new PeopleServiceImpl();
	}

	@After
	public void collector() {
		peopleServiceImpl = null;
	}

	@Test
	public void test_GetLondonPeople_Pass_CorrectLondonLatitudeLongitudeMatches() {
		List<People> coordinates = peopleServiceImpl.getLondonPeople(LATITUDE_BOUND, LONGITUDE_BOUND);

		assertEquals("Lattitude and Longitude Matches", coordinates);
	}

	@Test
	public void test_GetLondonPeople_Fail_IncorrectLatitudePlusOne() {
		List<People> coordinates = peopleServiceImpl.getLondonPeople(LATITUDE_BOUND +1, LONGITUDE_BOUND);

		assertEquals("Lattitude plus one does not match London latitude", coordinates);
	}

	@Test
	public void test_GetLondonPeople_Fail_IncorrectLatitudeMinusOne() {
		List<People> coordinates = peopleServiceImpl.getLondonPeople(LATITUDE_BOUND -1, LONGITUDE_BOUND);

		assertEquals("Lattitude minus one does not match London latitude", coordinates);
	}

	@Test
	public void test_GetLondonPeople_Fail_IncorrectLongitudePlusOne() {
		List<People> coordinates = peopleServiceImpl.getLondonPeople(LATITUDE_BOUND, LONGITUDE_BOUND +1);

		assertEquals("Longitude plus one does not match London latitude", coordinates);
	}

	@Test
	public void test_GetLondonPeople_Fail_IncorrectLongitudeMinusOne() {
		List<People> coordinates = peopleServiceImpl.getLondonPeople(LATITUDE_BOUND, LONGITUDE_BOUND -1);

		assertEquals("Longitude minus one does not match London latitude", coordinates);
	}

	@Test
	public void test_GetLondonPeople_Fail_IncorrectLongitudeAndLatitude_LongPluesOne_LatPlusOne() {
		List<People> coordinates = peopleServiceImpl.getLondonPeople(LATITUDE_BOUND +1, LONGITUDE_BOUND +1);

		assertEquals("Longitude & Lattitude plus one does not match London latitude", coordinates);
	}
	
	@Test
	public void test_GetLondonPeople_Fail_IncorrectLongitudeAndLatitude_LongMinusOne_LatMinusOne() {
		List<People> coordinates = peopleServiceImpl.getLondonPeople(LATITUDE_BOUND -1, LONGITUDE_BOUND -1);

		assertEquals("Longitude & latitude minus one does not match London latitude", coordinates);
	}
	
	@Test
	public void test_GetLondonPeople_Fail_IncorrectLongitudeAndLatitude_LongPlusOne_LatMinusOne() {
		List<People> coordinates = peopleServiceImpl.getLondonPeople(LATITUDE_BOUND +1, LONGITUDE_BOUND -1);

		assertEquals("Longitude plus one & latitude minus one does not match London latitude", coordinates);
	}
	
	@Test
	public void test_GetLondonPeople_Fail_IncorrectLongitudeAndLatitude_LongMinusOne_LatPlusOne() {
		List<People> coordinates = peopleServiceImpl.getLondonPeople(LATITUDE_BOUND -1, LONGITUDE_BOUND +1);

		assertEquals("Longitude minus one & latitude plus one does not match London latitude", coordinates);
	}

}
