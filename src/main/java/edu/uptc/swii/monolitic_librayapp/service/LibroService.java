package edu.uptc.swii.monolitic_librayapp.service;

import edu.uptc.swii.monolitic_librayapp.domain.Libro;
import edu.uptc.swii.monolitic_librayapp.repository.LibroRepository;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LibroService {
    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public List<Libro> buscarDestacados() {
        return libroRepository.findAll();
    }
}