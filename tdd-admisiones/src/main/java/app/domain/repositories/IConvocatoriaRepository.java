package app.domain.repositories;

import app.domain.model.IInscripcion;
import java.util.List;

public interface IConvocatoriaRepository {
    List<IInscripcion> obtenerInscripciones(long idConvocatoria);
}


