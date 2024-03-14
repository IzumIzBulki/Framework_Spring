package github.IzumIzBulki.FS_Homework_12.service;

import github.IzumIzBulki.FS_Homework_12.entity.Task;
import github.IzumIzBulki.FS_Homework_12.entity.Status;
import java.util.List;

public interface TaskService {

    List<Task> getAllTask();

    List<Task> getTaskByStatus(Status status);

    Task getTaskById(Long id);

    boolean createTask(Task task);

    boolean updateTaskStatus(Long id, Status status);

    boolean deleteTask(Long id);
}
