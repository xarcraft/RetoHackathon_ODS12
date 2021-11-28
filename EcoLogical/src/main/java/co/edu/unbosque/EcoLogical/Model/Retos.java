package co.edu.unbosque.EcoLogical.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="retosEco")
public class Retos {
	
	@Id
	private String _id;
	private String nombre_reto;
	private String clave_reto;
	private String descripcion_reto;
	private Integer puntos_reto;
	private Integer num_reto;
	
	
	
	
	public Integer getNum_reto() {
		return num_reto;
	}
	public void setNum_reto(Integer num_reto) {
		this.num_reto = num_reto;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getNombre_reto() {
		return nombre_reto;
	}
	public void setNombre_reto(String nombre_reto) {
		this.nombre_reto = nombre_reto;
	}
	public String getClave_reto() {
		return clave_reto;
	}
	public void setClave_reto(String clave_reto) {
		this.clave_reto = clave_reto;
	}
	public String getDescripcion_reto() {
		return descripcion_reto;
	}
	public void setDescripcion_reto(String descripcion_reto) {
		this.descripcion_reto = descripcion_reto;
	}
	public Integer getPuntos_reto() {
		return puntos_reto;
	}
	public void setPuntos_reto(Integer puntos_reto) {
		this.puntos_reto = puntos_reto;
	}
	
	
	
	

}
