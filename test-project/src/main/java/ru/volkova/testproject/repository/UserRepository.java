package ru.volkova.testproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.volkova.testproject.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
