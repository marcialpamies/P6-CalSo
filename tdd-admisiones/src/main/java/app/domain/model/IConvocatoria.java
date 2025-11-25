package app.domain.model;

import java.util.List;

public interface IConvocatoria {
	
	long getId();
	String getDescription();
	double getPrecio();
	int getMaxPlazas();
	List<IInscripcion> inscripciones();

}
