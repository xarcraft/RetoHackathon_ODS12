package co.edu.unbosque.EcoLogical.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.EcoLogical.Model.Detalle_Reto;
import co.edu.unbosque.EcoLogical.Model.Retos;
import co.edu.unbosque.EcoLogical.Repository.Detalle_RetoDAO;
import co.edu.unbosque.EcoLogical.Repository.RetosDAO;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET,
		RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/detalle_retos")
public class Detalle_RetoAPI {
	
	@Autowired
	private Detalle_RetoDAO detallesdao;
	
	@PostMapping("/guardar")
	public Detalle_Reto guardar(@Validated @RequestBody Detalle_Reto detalles) {
		return detallesdao.insert(detalles);
	}
	
	@GetMapping("/listar")
	public List<Detalle_Reto> listar(){
		return detallesdao.findAll();
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Detalle_Reto detalles) {
		detallesdao.save(detalles);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable String id) {
		detallesdao.deleteById(id);
	}


}
