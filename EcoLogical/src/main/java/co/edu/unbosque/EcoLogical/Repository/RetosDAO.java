package co.edu.unbosque.EcoLogical.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import co.edu.unbosque.EcoLogical.Model.Retos;

public interface RetosDAO extends MongoRepository<Retos, String>{

}
