package ru.IzumIzBulki.server.controller;

import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.IzumIzBulki.server.model.Student;
import ru.IzumIzBulki.server.repository.StudentRepository;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Класс контролер обработки запросов к WEB серверу
 */
@RestController
@AllArgsConstructor
@RequestMapping("/server")
public class Controller {

    /**
     * Репозиторий хранения записей информации о студентах
     */
    StudentRepository repository;

    /**
     * Обработка запроса на добавление новой записи о студенте
     *
     * @param student
     * @return Ответ что запись добавлена в базу данных
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<String> addStudent(@RequestBody Student student) {
        repository.save(student);
        return new ResponseEntity<>("Студент добавлен", HttpStatus.CREATED);
    }

    /**
     * Обработка запроса вывода всех записей из базы данных
     *
     * @return Список студентов
     */
    @GetMapping("/all")
    public ResponseEntity<List<Student>> findAllStudents() {
        List allStudents;
        try {
            allStudents = repository.findAll();
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>((List<Student>) allStudents, HttpStatus.OK);
    }

    /**
     * Метод обработки запроса на удаление записи по идентификатору
     *
     * @param id идентификатор удаляемого студента
     * @return Информация что запись удалена
     */
    @RequestMapping(value = "/del", method = RequestMethod.DELETE)
    public ResponseEntity<List<Student>> deleteStudent(@RequestBody Long id) {
        repository.deleteById(id);
        return findAllStudents();
    }
}
