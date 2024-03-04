package com.example.FS_Homework_8.repositories;

import com.example.FS_Homework_8.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Интерфейс взаимодействия с базой данных
 */
public interface NoteRepository extends JpaRepository<Note, Long> {

}
