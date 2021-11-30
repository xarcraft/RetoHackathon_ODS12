package co.edu.unbosque.EcoLogical.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="retosEco")
public class Retos {
	
	@Id
	private String _id;
	private Long codigo_reto;
	private String nombre_reto;
	private String clave_reto;
	private String descripcion_reto;
	private String cedula_usuario;
	private Long puntos_reto;
	private Long total_puntos;
	private Long num_reto;
	
	
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
	public String getCedula_usuario() {
		return cedula_usuario;
	}
	public void setCedula_usuario(String cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
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
	public Long getNum_reto() {
		return num_reto;
	}
	public void setNum_reto(Long num_reto) {
		this.num_reto = num_reto;
	}
	
	
	
	
	
	

}
