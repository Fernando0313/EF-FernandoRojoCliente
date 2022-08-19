package com.idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.idat.model.Cliente;
import com.idat.service.ClienteService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class ClienteController {

	@Autowired
	private ClienteService serv;
	
	
	 @RequestMapping(path = "/cliente/listar", method = RequestMethod.GET)
	    public ResponseEntity<List<Cliente>> listarClientes(){
	        return new ResponseEntity<List<Cliente>>(serv.list() , HttpStatus.CREATED);  
	    }
	 
	 
	 
	  @RequestMapping(path = "/cliente/guardar", method = RequestMethod.POST)
	    public ResponseEntity<Void> guardar(@RequestBody Cliente cliente){
	        serv.registro(cliente);
	        return  new ResponseEntity<Void>(HttpStatus.CREATED);    
	    }

}
