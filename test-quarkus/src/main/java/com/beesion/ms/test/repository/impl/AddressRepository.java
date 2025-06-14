package com.beesion.ms.test.repository.impl;



import com.beesion.ms.model.Address;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class AddressRepository implements PanacheRepository<Address> {
    public List<Address> findByPersonId(Long personId) {
        return list("person.id", personId);
    }
}