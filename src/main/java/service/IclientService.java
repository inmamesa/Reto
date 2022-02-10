package service;

import java.util.List;

import model.Client;

public interface IclientService {
	
	Client crear();
	void borrar();
	List<Client> ver();

}
