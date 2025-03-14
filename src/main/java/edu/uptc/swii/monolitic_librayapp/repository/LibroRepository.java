package edu.uptc.swii.monolitic_librayapp.repository;

import edu.uptc.swii.monolitic_librayapp.domain.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Integer> {
    
}
