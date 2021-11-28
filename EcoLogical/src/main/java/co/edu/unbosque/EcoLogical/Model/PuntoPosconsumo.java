package co.edu.unbosque.EcoLogical.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="PuntosPosconsumo")
public class PuntoPosconsumo {
	
	@Id
	private String _id;
	private String Nombre;
	private String Direccion;
	private String Ciudad;
	private String Departamento;
	private String Pais;
	private String Categoria_residuo;
	private String Tipo_residuo;
	private String Nombre_residuo;
	private String Ubicacion;
	private String Horario;
	private String Nombre_programa;
	private String Contacto;
	private String email;
	private String clave;
	
	
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getCiudad() {
		return Ciudad;
	}
	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	public String getDepartamento() {
		return Departamento;
	}
	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}
	public String getCategoria_residuo() {
		return Categoria_residuo;
	}
	public void setCategoria_residuo(String categoria_residuo) {
		Categoria_residuo = categoria_residuo;
	}
	public String getTipo_residuo() {
		return Tipo_residuo;
	}
	public void setTipo_residuo(String tipo_residuo) {
		Tipo_residuo = tipo_residuo;
	}
	public String getNombre_residuo() {
		return Nombre_residuo;
	}
	public void setNombre_residuo(String nombre_residuo) {
		Nombre_residuo = nombre_residuo;
	}
	public String getUbicacion() {
		return Ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}
	public String getHorario() {
		return Horario;
	}
	public void setHorario(String horario) {
		Horario = horario;
	}
	public String getNombre_programa() {
		return Nombre_programa;
	}
	public void setNombre_programa(String nombre_programa) {
		Nombre_programa = nombre_programa;
	}
	public String getContacto() {
		return Contacto;
	}
	public void setContacto(String contacto) {
		Contacto = contacto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
