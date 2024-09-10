package com.ProjectLog4jGit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

@Autowired
PaymentDao dao;

public String updatedatabase(List<Payment> list)
{
	return dao.updatedatabase(list);
}

public List<Payment> getvaluesusingpassword(String password) throws PasswordNotMatchException
{ List<Payment> alllist=dao.currentdatabase();
String ogpassword=alllist.get(0).getPassword();
	if(password.equals(ogpassword))
	{
		return dao.currentdatabase();
	}
	
	else
	{
		throw new PasswordNotMatchException("Incorrect Password");
	}
	
	
	}



}
