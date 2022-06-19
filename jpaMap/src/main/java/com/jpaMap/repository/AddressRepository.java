package com.jpaMap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jpaMap.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
