package webcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.TestService;
@Controller 
public class HelloWorldController { 
	@Autowired
	private TestService testService;
     @RequestMapping("/helloWorld") 
     public String helloWorld(Model model) { 
    	 String sql=testService.pingSql();
          model.addAttribute( "message", "Hello World!"); 
          model.addAttribute( "sql", sql); 
          return "helloWorld"; 
     } 
}