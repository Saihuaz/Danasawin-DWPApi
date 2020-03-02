package danasawin.dwptest.restapi.dwptestrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import danasawin.dwptest.restapi.dwptestrestapi.model.People;
import danasawin.dwptest.restapi.dwptestrestapi.service.PeopleService;

@RestController
@RequestMapping("/myapp")
public class PeopleController {

	private final PeopleService peopleService;

	@Autowired
	public PeopleController(PeopleService peopleService) {
		this.peopleService = peopleService;
	}

	@GetMapping("/allpeople")
	public List<Object> AllPeople() {
		return peopleService.getAllPeople();
	}

	@GetMapping("/londonpeople")
	public List<People> LondonPeople() {
		return peopleService.getLondonPeople(51.509865, -0.118092);
	}
}
