package ru.volkova.testproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HotClientDto {
    private String name;
    private String surname;
    private Date dateOfBirth;
    private String phoneNumber;
    private Long loanSize;
    private int loanTermInMonth;
}
