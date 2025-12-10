package org.example.mapper;

import org.example.dto.customer.CustomerAdminResponseDto;
import org.example.dto.customer.CustomerPublicResponseDto;
import org.example.dto.customer.CustomerRequestDto;
import org.example.model.Customer;

public class CustomerMapper {
    public static Customer toEntity(CustomerRequestDto customerRequestDto) {
        if (customerRequestDto == null) {
            return null;
        }
        return Customer.builder()
                .firstName(customerRequestDto.getFirstName())
                .lastName(customerRequestDto.getLastName())
                .phoneNumber(customerRequestDto.getPhoneNumber())
                .secondaryPhoneNumber(customerRequestDto.getSecondaryPhoneNumber())
                .email(customerRequestDto.getEmail())
                .city(customerRequestDto.getCity())
                .address(customerRequestDto.getAddress())
                .zipCode(customerRequestDto.getZipCode())
                .dateOfBirth(customerRequestDto.getDateOfBirth())
                .driverLicenseNumber(customerRequestDto.getDriverLicenseNumber())
                .build();
    }

    public static CustomerAdminResponseDto toAdminDto(Customer customer) {
        if (customer == null) {
            return null;
        }
        return CustomerAdminResponseDto.builder()
                .id(customer.getId())
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .phoneNumber(customer.getPhoneNumber())
                .secondaryPhoneNumber(customer.getSecondaryPhoneNumber())
                .email(customer.getEmail())
                .city(customer.getCity())
                .address(customer.getAddress())
                .zipCode(customer.getZipCode())
                .dateOfBirth(customer.getDateOfBirth())
                .driverLicenseNumber(customer.getDriverLicenseNumber())
                .build();
    }

    public static CustomerPublicResponseDto toPublicDto(Customer customer) {
        if (customer == null) {
            return null;
        }
        return CustomerPublicResponseDto.builder()
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .phoneNumber(customer.getPhoneNumber())
                .city(customer.getCity())
                .address(customer.getAddress())
                .zipCode(customer.getZipCode())
                .dateOfBirth(customer.getDateOfBirth())
                .build();
    }
}
