package com.privalia.repository;

import com.privalia.model.Client;
import org.springframework.data.repository.CrudRepository;


public interface ClientRepository extends CrudRepository<Client, String > {
}
