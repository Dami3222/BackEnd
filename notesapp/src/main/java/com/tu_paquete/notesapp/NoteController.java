package com.tu_paquete.notesapp.controller;

import java.util.List;
import com.tu_paquete.notesapp.model.Note;
import com.tu_paquete.notesapp.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @GetMapping
    public List<Note> getAllNotes() {
        return noteService.getAllNotes();
    }

    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable Long id) {
        return noteService.getNoteById(id);
    }

    @PostMapping
    public Note createNote(@RequestBody Note note) {
        return noteService.saveOrUpdate(note);
    }

    @PutMapping("/{id}")
    public Note updateNote(@PathVariable Long id, @RequestBody Note note) {
        note.setId(id);
        return noteService.saveOrUpdate(note);
    }

    @DeleteMapping("/{id}")
    public void deleteNoteById(@PathVariable Long id) {
        noteService.deleteNoteById(id);
    }
}
