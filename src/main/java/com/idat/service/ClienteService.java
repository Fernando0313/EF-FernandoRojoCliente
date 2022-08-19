package com.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.model.Cliente;
import com.idat.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	ClienteRepository repo;
	
	public void registro(Cliente cliente) {
		repo.save(cliente);
	}
	
	public List<Cliente> list(){
		return repo.findAll();
	}
}
