package app.domain.model;

import java.time.LocalDate;

public interface IInscripcion {
	
	public Usuario getUser();
    public double getCredito();
    public int getCursosEnTematica();
    public LocalDate getFechaAlta();
    public long getId();
}


