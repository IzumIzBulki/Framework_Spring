package com.example.FS_Homework_8.services;

import com.example.FS_Homework_8.aspects.TrackUserAction;
import com.example.FS_Homework_8.model.Note;
import com.example.FS_Homework_8.repositories.NoteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * Класс NoteService взаимодействия с базой данных
 */
@Service
@AllArgsConstructor
public class NoteService {

    /**
     * Поле взаимодействия с базой данных
     */
    private NoteRepository noteRepository;

    /**
     * Метод просмотра всех заметок
     * @return список всех заметок
     */
    @TrackUserAction
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    /**
     * Метод создания заметки
     * @param note создаваемая заметка
     * @return созданная заметка
     */
    @TrackUserAction
    public Note addNote(Note note) {
        note.setCreationDate(LocalDate.now());
        noteRepository.save(note);
        return note;
    }
}
