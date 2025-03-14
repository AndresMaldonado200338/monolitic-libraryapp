package edu.uptc.swii.monolitic_librayapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import edu.uptc.swii.monolitic_librayapp.domain.Libro;
import edu.uptc.swii.monolitic_librayapp.service.LibroService;

@Controller
public class ListadoController {

    private final LibroService libroService;

    public ListadoController(LibroService libroService) {
        this.libroService = libroService;
    }

    @RequestMapping("/")
    public String listarLibros(Model model) {
        List<Libro> destacados = libroService.buscarDestacados();
        model.addAttribute("libros", destacados);
        return "listado";
    }
}