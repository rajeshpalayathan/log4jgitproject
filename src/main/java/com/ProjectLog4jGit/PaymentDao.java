package com.ProjectLog4jGit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentDao {
@Autowired
PaymentRepositry rep;
public String updatedatabase(List<Payment> list)
{
	rep.saveAll(list);
	return "payment detials updated successfully";
}
public List<Payment> currentdatabase() {
	return rep.findAll();
}



}
