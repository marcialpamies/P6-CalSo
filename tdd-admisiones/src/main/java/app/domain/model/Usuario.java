package app.domain.model;

import java.time.LocalDate;

public class Usuario {

    protected double credito;
    protected int cursosEnTematica;
    protected LocalDate fechaAlta;
    protected long id;

    public Usuario(double credito, int cursosEnTematica,
                   LocalDate fechaAlta, long id) {
        this.credito = credito;
        this.cursosEnTematica = cursosEnTematica;
        this.fechaAlta = fechaAlta;
        this.id = id;
    }

    public double getCredito() { 
    	return credito; 
    }
    
    public int getCursosEnTematica() { 
    	return cursosEnTematica; 
    }
    
    public LocalDate getFechaAlta() { 
    	return fechaAlta; 
    }
    
    public long getId() { 
    	return id; 
    }

    public void descontarCredito(double c) { 
    	credito -= c; 
    }
    
    public void incrementarCursos() { 
    	cursosEnTematica++; 
    }
}
