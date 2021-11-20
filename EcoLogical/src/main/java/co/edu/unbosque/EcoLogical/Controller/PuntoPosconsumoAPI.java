package co.edu.unbosque.EcoLogical.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import co.edu.unbosque.EcoLogical.Model.PuntoPosconsumo;
import co.edu.unbosque.EcoLogical.Repository.PuntoPosconsumoDAO;


@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET})
@RequestMapping("/api/puntos")
public class PuntoPosconsumoAPI {
	
	@Autowired
	private PuntoPosconsumoDAO puntosposdao;
	
	@GetMapping("/listar")
	public List<PuntoPosconsumo> listar(){
		return puntosposdao.findAll();
	}
	
	
}
