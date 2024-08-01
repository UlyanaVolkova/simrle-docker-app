package ru.volkova.testproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.volkova.testproject.model.HotClient;

public interface HotClientRepository extends JpaRepository<HotClient, Long> {
}
