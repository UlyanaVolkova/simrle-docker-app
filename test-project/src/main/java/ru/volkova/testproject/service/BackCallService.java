package ru.volkova.testproject.service;

import ru.volkova.testproject.dto.BackCallDto;

public interface BackCallService {
    BackCallDto getBackCallById(Long id);
}
