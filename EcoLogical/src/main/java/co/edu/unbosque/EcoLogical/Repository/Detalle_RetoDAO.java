package co.edu.unbosque.EcoLogical.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.EcoLogical.Model.Detalle_Reto;
import co.edu.unbosque.EcoLogical.Model.Retos;

public interface Detalle_RetoDAO extends MongoRepository<Detalle_Reto, String>{

}