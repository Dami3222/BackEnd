package com.tu_paquete.notesapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tu_paquete.notesapp.model.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {
}