package co.edu.unbosque.EcoLogical.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import co.edu.unbosque.EcoLogical.Model.PuntoPosconsumo;


public interface PuntoPosconsumoDAO extends MongoRepository<PuntoPosconsumo, String>{
	
	//List<PuntoPosconsumo> findByNombre(String Nombre);

}
