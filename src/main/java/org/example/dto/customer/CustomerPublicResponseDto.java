package org.example.dto.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.City;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerPublicResponseDto {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private City city;
    private String address;
    private String zipCode;
    private LocalDate dateOfBirth;
}
