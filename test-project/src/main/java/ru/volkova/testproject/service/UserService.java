package ru.volkova.testproject.service;

import ru.volkova.testproject.dto.UserDto;

public interface UserService {
    UserDto getUserById(Long id);
}
