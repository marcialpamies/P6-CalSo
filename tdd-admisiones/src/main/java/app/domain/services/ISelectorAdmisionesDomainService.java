package app.domain.services;

import app.domain.model.IInscripcion;
import java.util.List;

public interface ISelectorAdmisionesDomainService {

    public List<IInscripcion> seleccionar(List<IInscripcion> ins, double costeCurso, int maxPlazas);
}


