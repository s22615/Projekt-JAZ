package com.edu.pjatk.demo;

import com.edu.pjatk.demo.data.adress;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends CrudRepository<adress,Integer>{
    List<adress> findBymiasto(String miasto);
}
