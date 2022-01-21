package com.edu.pjatk.demo.repositories;

import com.edu.pjatk.demo.data.client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<client, Integer> {
}
