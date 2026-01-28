package com.ecommerce.project.database.dao;

import com.ecommerce.project.database.dto.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
