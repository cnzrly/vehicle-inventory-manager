package org.example.model;

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
public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String secondaryPhoneNumber;
    private String email;

    private City city;
    private String zipCode;
    private String address;

    private LocalDate dateOfBirth;
    private String driverLicenseNumber;
}
