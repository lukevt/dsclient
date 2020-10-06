package com.lfcsvt.bdsclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lfcsvt.bdsclient.entities.Client;

public interface ClientRepository  extends JpaRepository<Client, Long>{

}
