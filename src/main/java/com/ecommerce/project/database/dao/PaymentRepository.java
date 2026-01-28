package com.ecommerce.project.database.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.project.database.dto.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{

}