package com.example.apiLibrary.servicios;


import com.example.apiLibrary.modelos.Libro;
import com.example.apiLibrary.repositorios.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServicio {
    // Inyectar el repositorio de LibroServicio para realizar el CRUD
    @Autowired
    private LibroRepositorio libroRepositorio;

    public LibroServicio(LibroRepositorio libroRepositorio) {
        this.libroRepositorio = libroRepositorio;
    }
    // Generar los métodos para el CRUD que serán invocados desde el controlador
    public Libro saveLibro(Libro libro){
        return libroRepositorio.save(libro);
    }

    public List<Libro> getLibros(){
        return libroRepositorio.findAll();
    }

}
