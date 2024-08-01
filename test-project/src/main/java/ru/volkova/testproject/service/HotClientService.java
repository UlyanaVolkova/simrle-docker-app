package ru.volkova.testproject.service;

import ru.volkova.testproject.dto.HotClientDto;

public interface HotClientService {
    HotClientDto getHotClientById(Long id);
}
