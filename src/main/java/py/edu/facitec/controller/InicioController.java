package py.edu.facitec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InicioController {

	@RequestMapping("/")
	public String index() {
		return "inicio";
	}
}
