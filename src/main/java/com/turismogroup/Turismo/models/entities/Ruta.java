package com.turismogroup.Turismo.models.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="RUTA")
@Getter @Setter @NoArgsConstructor
public class Ruta {

	@Id	
	private Long RutaID;
		
		private String DireccionSalida;
		
		private String Kilometraje;
		
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="ViajeID", nullable=true, unique = true)
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private Viaje ViajeID;
		
		private String HoraSalida;
		
		private String HoraLlegada;
		
		private String Fecha;
		
		private String Disponibilidad;
		
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="DUI", nullable=true, unique = true)
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private Cliente DUI;
		
		private String Asiento_Personas;
}
