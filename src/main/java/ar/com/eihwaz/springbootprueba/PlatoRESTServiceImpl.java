package ar.com.eihwaz.springbootprueba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo")
public class PlatoRESTServiceImpl {

	@Autowired
	private PlatoRepository platoRepository;
	
//	@PostMapping(path="/add") // Map ONLY POST Requests
//	public @ResponseBody String addNewUser (@RequestParam String name
//		, @RequestParam String email) {
//		// @ResponseBody means the returned String is the response, not a view name
//		// @RequestParam means it is a parameter from the GET or POST request
//		
//		User n = new User();
//		n.setName(name);
//		n.setEmail(email);
//		userRepository.save(n);
//		return "Saved";
//	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Plato> getAllPlatos() {
		// This returns a JSON or XML with the users
		return platoRepository.findAll();
	}
	
}
