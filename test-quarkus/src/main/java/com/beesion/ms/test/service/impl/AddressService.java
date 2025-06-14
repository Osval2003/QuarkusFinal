package com.beesion.ms.test.service.impl;

import com.beesion.ms.model.Address;

import com.beesion.ms.test.repository.impl.AddressRepository;
import com.beesion.ms.test.service.IAddressService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;

@ApplicationScoped
public class AddressService implements IAddressService {

    @Inject
    AddressRepository addressRepository;


    public Address save(Address address) {
        addressRepository.persist(address);
        return address;
    }


    public List<Address> findByPersonId(Long personId) {
        return addressRepository.findByPersonId(personId);
    }
}