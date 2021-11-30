package co.edu.unbosque.EcoLogical.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="DetalleRetos")
public class Detalle_Reto {
	
	@Id
	private String _id;
	private Long codigo_reto;
	private Long num_reto;
	private Long puntos_reto;
	private Long total_puntos;
	
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public Long getCodigo_reto() {
		return codigo_reto;
	}
	public void setCodigo_reto(Long codigo_reto) {
		this.codigo_reto = codigo_reto;
	}
	public Long getNum_reto() {
		return num_reto;
	}
	public void setNum_reto(Long num_reto) {
		this.num_reto = num_reto;
	}
	public Long getPuntos_reto() {
		return puntos_reto;
	}
	public void setPuntos_reto(Long puntos_reto) {
		this.puntos_reto = puntos_reto;
	}
	public Long getTotal_puntos() {
		return total_puntos;
	}
	public void setTotal_puntos(Long total_puntos) {
		this.total_puntos = total_puntos;
	}
	
	
	

}
