package co.edu.unbosque.EcoLogical.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.EcoLogical.Model.Usuarios;

public interface UsuariosDAO extends MongoRepository<Usuarios, String>{
	
	
}