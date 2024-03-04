package com.exm.model;

import java.io.Serializable;

public class Agente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int agenteId;
	private String agentenombre;
	private String agentearea;
	private String agentefechacreacion;
	private String agentefechamodificacion;
	
	public int getAgenteId() {
		return agenteId;
	}
	public void setAgenteId(int agenteId) {
		this.agenteId = agenteId;
	}
	public String getAgentenombre() {
		return agentenombre;
	}
	public void setAgentenombre(String agentenombre) {
		this.agentenombre = agentenombre;
	}
	public String getAgentearea() {
		return agentearea;
	}
	public void setAgentearea(String agentearea) {
		this.agentearea = agentearea;
	}
	public String getAgentefechacreacion() {
		return agentefechacreacion;
	}
	public void setAgentefechacreacion(String agentefechacreacion) {
		this.agentefechacreacion = agentefechacreacion;
	}
	public String getAgentefechamodificacion() {
		return agentefechamodificacion;
	}
	public void setAgentefechamodificacion(String agentefechamodificacion) {
		this.agentefechamodificacion = agentefechamodificacion;
	}
	
	@Override
	public String toString() {
		return "Agente [agenteId=" + agenteId + ", agentenombre=" + agentenombre + ", agentearea=" + agentearea
				+ ", agentefechacreacion=" + agentefechacreacion + ", agentefechamodificacion="
				+ agentefechamodificacion + "]";
	}
	
}