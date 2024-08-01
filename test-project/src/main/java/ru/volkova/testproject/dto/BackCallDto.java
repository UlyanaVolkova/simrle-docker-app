package ru.volkova.testproject.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BackCallDto {
    private Long id;
    private String name;
    private String surname;
    private String phoneNumber;
    private boolean completed;
}
