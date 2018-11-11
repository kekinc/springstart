package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="products")
public class ProductsController {
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String productList() {
		return "list";
	}
}
