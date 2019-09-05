package com.alekto.acheron.repositories

import com.alekto.acheron.entitys.Customer
import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository : JpaRepository<Customer, Long>