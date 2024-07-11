package aplicaciones.spring.modelo;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orden")
public class Orden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String numero;
	private Date fecheC;
	private Date fechaF;
	private double total;
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToOne(mappedBy = "orden")
	private DetalleO detalle;
	
	public Orden() {
	}

	public Orden(Integer id, String numero, Date fecheC, Date fechaF, double total) {
		super();
		this.id = id;
		this.numero = numero;
		this.fecheC = fecheC;
		this.fechaF = fechaF;
		this.total = total;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public Date getFecheC() {
		return fecheC;
	}


	public void setFecheC(Date fecheC) {
		this.fecheC = fecheC;
	}


	public Date getFechaF() {
		return fechaF;
	}


	public void setFechaF(Date fechaF) {
		this.fechaF = fechaF;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}
  
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public DetalleO getDetalle() {
		return detalle;
	}

	public void setDetalle(DetalleO detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "Orden [id=" + id + ", numero=" + numero + ", total=" + total + "]";
	}
}
