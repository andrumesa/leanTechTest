package com.leantech.staffapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.leantech.staffapp.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> ,JpaSpecificationExecutor<Person>{
}
