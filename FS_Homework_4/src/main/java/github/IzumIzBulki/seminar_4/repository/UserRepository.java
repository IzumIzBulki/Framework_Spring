package github.IzumIzBulki.seminar_4.repository;

import java.util.List;
import java.util.Optional;

import github.IzumIzBulki.seminar_4.entity.User;

public interface UserRepository {

    Optional<User> findById(Integer id);

    List<User> findAll();

    void save(User user);

    void deleteById(Integer id);

    Optional<User> findByName(String name);
}
