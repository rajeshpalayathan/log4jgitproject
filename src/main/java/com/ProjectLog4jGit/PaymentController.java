package com.ProjectLog4jGit;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/paymentRM")
public class PaymentController {
	
	static Logger log = Logger.getLogger(PaymentController.class);
	@Autowired
	PaymentService ser;

	@PostMapping(value = "/updatevalues")
//url=http://localhost:1426/paymentRM/updatevalues
	public String updatedatabase(@RequestBody List<Payment> list) {
		return ser.updatedatabase(list);
	}
	
@GetMapping(value="/getvalues/{password}")
//url=http://localhost:1426/paymentRM/getvalues/input
public List<Payment> getvaluesusingpassword(@PathVariable String password) throws PasswordNotMatchException
{
	PropertyConfigurator.configure("projectLog4jGit.properties");
	log.error(ser.getvaluesusingpassword(password));
	return ser.getvaluesusingpassword(password);
}
	
}

