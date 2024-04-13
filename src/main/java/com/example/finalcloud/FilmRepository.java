package com.example.finalcloud;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long> {
    // add custom queries later if needed
}
