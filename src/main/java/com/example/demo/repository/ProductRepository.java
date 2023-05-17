package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Produto;

//Define essa classe como um repositório do JPA
@Repository
public interface ProductRepository extends JpaRepository<Produto, Long>{

}
