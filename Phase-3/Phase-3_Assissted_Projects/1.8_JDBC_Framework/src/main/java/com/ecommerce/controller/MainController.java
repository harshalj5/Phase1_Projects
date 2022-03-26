package com.ecommerce.controller;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecommerce.dao.EProductDAO;
import com.ecommerce.entity.Eproduct;
@Controller
public class MainController {
        
	        
	           @Autowired    
	            EProductDAO eproductDAO;    
	           @RequestMapping(value = "/listProducts", method = RequestMethod.GET)
	            public String listProducts(ModelMap map)
	            {
	        	   	
                   java.util.List<Eproduct> list= eproductDAO.getProducts();
              // model.addattribute("list",list);
               return "listProducts";

	            }


}
