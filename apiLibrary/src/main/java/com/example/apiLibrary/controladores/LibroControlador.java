package com.example.apiLibrary.controladores;

import com.example.apiLibrary.modelos.Libro;
import com.example.apiLibrary.servicios.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroControlador {
    // Inyectar a LibroServicio
    @Autowired
    private LibroServicio libroServicio;

    @GetMapping
    public List<Libro> getAllLibros(){
        return libroServicio.getLibros();
    }

    @PostMapping
    public Libro createLibro(@RequestBody Libro libro){
        return libroServicio.saveLibro(libro);
    }

}
