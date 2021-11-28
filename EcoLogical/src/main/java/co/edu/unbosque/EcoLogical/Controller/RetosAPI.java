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
import co.edu.unbosque.EcoLogical.Model.Retos;
import co.edu.unbosque.EcoLogical.Repository.RetosDAO;


@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET,
		RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/retos")
public class RetosAPI {
	
	@Autowired
	private RetosDAO retosdao;
	
	@PostMapping("/guardar")
	public Retos guardar(@Validated @RequestBody Retos retos) {
		return retosdao.insert(retos);
	}
	
	@GetMapping("/listar")
	public List<Retos> listar(){
		return retosdao.findAll();
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Retos retos) {
		retosdao.save(retos);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable String id) {
		retosdao.deleteById(id);
	}

}
