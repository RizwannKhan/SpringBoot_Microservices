package com.rizwan.customer.repository;

import com.rizwan.customer.modal.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
}
