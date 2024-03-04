package com.example.FS_Homework_8.controllers;

import com.example.FS_Homework_8.model.Note;
import com.example.FS_Homework_8.repositories.NoteRepository;
import com.example.FS_Homework_8.services.NoteService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

/**
 * Класс NoteController обрабатывает http запросы
 */
@RestController
@AllArgsConstructor
@RequestMapping("/notes")
public class NoteController {

    /**
     * Поле взаимодействия с базой данных
     */
    private NoteService noteService;

    /**
     * Метод просмотра всех заметок
     * @return список всех заметок
     */
    @GetMapping
    public ResponseEntity<List<Note>> getAllNotes() {
        return ResponseEntity.ok(noteService.getAllNotes());
    }

    /**
     * Метод создания заметки
     * @param note создаваемая заметка
     * @return созданная заметка
     */
    @PostMapping
    public ResponseEntity<Note> addNote(@RequestBody Note note) {
        note.setCreationDate(LocalDate.now());
        return new ResponseEntity<>(noteService.addNote(note), HttpStatus.CREATED);
    }
}
