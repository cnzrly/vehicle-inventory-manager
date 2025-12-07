package org.example.repository.customer;

import org.example.model.Customer;
import org.example.repository.BaseRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends BaseRepository<Customer> {
    Customer save(Customer customer);

    Optional<Customer> findById(Long id);

    List<Customer> findAll();

    Customer update(Customer customer);

    void deleteById(Long id);
}
