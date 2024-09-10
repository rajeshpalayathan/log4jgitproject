package com.ProjectLog4jGit;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepositry extends JpaRepository<Payment, Integer> {
	
}
