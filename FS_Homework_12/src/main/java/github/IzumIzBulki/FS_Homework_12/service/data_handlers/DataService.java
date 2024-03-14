package github.IzumIzBulki.FS_Homework_12.service.data_handlers;


import org.springframework.stereotype.Service;

@Service
public interface DataService {
    void writeData(String filename, String data);
}
