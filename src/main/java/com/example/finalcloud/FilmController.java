package com.example.finalcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/films")
public class FilmController {

    @Autowired
    private FilmRepository filmRepository;

    @PostMapping
    public Film createFilm(@RequestBody Film film) {
        return filmRepository.save(film);
    }

    @GetMapping
    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }
}
