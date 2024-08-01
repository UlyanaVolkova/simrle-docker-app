package ru.volkova.testproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.volkova.testproject.model.BackCall;

public interface BackCallRepository extends JpaRepository<BackCall, Long> {
}
