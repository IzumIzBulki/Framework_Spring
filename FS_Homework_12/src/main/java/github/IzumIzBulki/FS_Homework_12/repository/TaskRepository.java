package github.IzumIzBulki.FS_Homework_12.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import github.IzumIzBulki.FS_Homework_12.entity.Status;
import github.IzumIzBulki.FS_Homework_12.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {    

    // для теста производительности
    @Query(value = "SELECT * FROM tasks WHERE status=:status", nativeQuery = true)
    List<Task> getAllTaskByStatus(Status status);
}
