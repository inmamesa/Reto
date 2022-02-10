package controller;

import org.springframework.beans.factory.annotation.Autowired;

import service.ClientServiceImpl;

@RestController
public class ClientController {
	
	@Autowired
	private ClientServiceImpl clienteService;

}
