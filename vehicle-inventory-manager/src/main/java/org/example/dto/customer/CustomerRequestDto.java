package org.example.dto.customer;

import java.time.LocalDate;
import org.example.enums.City;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerRequestDto {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String secondaryPhoneNumber;
    private String email;


    private City city;
    private String address;


    private LocalDate dateOfBirth;
    private String driverLicenseNumber;
}