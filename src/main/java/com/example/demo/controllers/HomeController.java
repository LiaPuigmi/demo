package com.example.demo.controllers;

import java.util.Random;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.pojos.TextToJSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Controller
public class HomeController {

	
//	  @GetMapping("/index1") 
//	  public ModelAndView test() { 
//		  ModelAndView modelAndView = new ModelAndView(); 
//		  modelAndView.setViewName("test.html");
//		  modelAndView.setStatus(HttpStatus.I_AM_A_TEAPOT); 
//		  return modelAndView; 
//	  }
	 
	
	/*
	 * @ResponseBody
	 * @RequestMapping("/index2") 
	 * public String index() { 
	 * 	return "index.html"; 
	 * }
	 */
	  
	  /*
	   * En este caso, cada método devuelve el nombre de una vista (página HTML) que debe existir en el directorio de plantillas. 
	   * Por ejemplo, para el endpoint /index, debería haber una página index.html en el directorio de plantillas. 
	   * Lo mismo aplica para los endpoints /contacto y /acerca.
	   */
//	  @GetMapping("/index3") 
//	    public ModelAndView index2() {
//		  ModelAndView modelAndView = new ModelAndView(); 
//		  modelAndView.setViewName("indexBnb.html");
//		  modelAndView.setStatus(HttpStatus.I_AM_A_TEAPOT); 
//		  return modelAndView;
//	    }

//	  @GetMapping("/index4") 
//	    public ModelAndView index3() {
//		  ModelAndView modelAndView = new ModelAndView(); 
//		  modelAndView.setViewName("index17.html");
//		  modelAndView.setStatus(HttpStatus.I_AM_A_TEAPOT); 
//		  return modelAndView;
//	    }
	
		/*
		 * @ResponseBody
		 * @RequestMapping(path="/") 
		 * public TextToJSON test() { 
		 * return new TextToJSON("index.html"); 
		 * }
		 */
	
	// @ResponseBody
	// @RequestMapping(path="/", produces="application/json")
	// public String test() {
	//  	return "{\"page\": \"index.html\"}";
	// }
	
//	@ResponseBody
//	@RequestMapping("/")
//	public ObjectNode index() {
//		ObjectMapper mapper=new ObjectMapper();
//		ObjectNode objectNode=mapper.createObjectNode();
//		objectNode.put("key", "value");
//		objectNode.put("foo", "bar");
//		objectNode.put("number", 42);
//		return objectNode;
//	}
	
//	@ResponseBody
//	@RequestMapping("/")
//	public ResponseEntity<String> getGreetingWithResponseEntity() {
//		final HttpHeaders httpHeaders=new HttpHeaders();
//		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
//		return new ResponseEntity<String>("{\"test\": \"Hello with ResponseEntity\"}",
//				httpHeaders, HttpStatus.OK);
//	}
	
		@ResponseBody
		@ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
		@RequestMapping("/aleatorio")
	    public ResponseEntity<String> aleatorio() {
	        Random random = new Random();
	        int numero = random.nextInt(3);
	        if (numero == 0) {
	            return new ResponseEntity<String>("El número es 0", HttpStatus.OK);
	        } else if(numero==1){
	            return new ResponseEntity<String>("El número es 1", HttpStatus.NOT_FOUND);
	        }else {
	            return new ResponseEntity<String>("El número es 2", HttpStatus.I_AM_A_TEAPOT);
	        }
	    }

}

