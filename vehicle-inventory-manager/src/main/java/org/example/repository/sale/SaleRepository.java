package org.example.repository.sale;

import org.example.model.Sale;
import org.example.repository.BaseRepository;

import java.util.List;
import java.util.Optional;

public interface SaleRepository extends BaseRepository<Sale> {
    Sale save(Sale sale);

    Optional<Sale> findById(Long id);

    List<Sale> findAll();

    Sale update(Sale sale);

    void deleteById(Long id);
}
