package com.proyectosistemaventas.repository;

import com.proyectosistemaventas.model.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDocumentoRepository extends JpaRepository<TipoDocumento,Long> {
}
