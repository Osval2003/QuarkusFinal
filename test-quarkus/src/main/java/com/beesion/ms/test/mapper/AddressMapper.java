package com.beesion.ms.test.mapper;

import com.beesion.ms.model.Address;
import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.AddressDto;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AddressMapper {
    public Address toEntity(AddressDto dto) {
        Address address = new Address();
        address.setStreet(dto.getStreet());
        address.setCity(dto.getCity());
        address.setZipCode(dto.getZipCode());

        Person person = new Person();
        person.setId(dto.getPersonId());
        address.setPerson(person);

        return address;
    }
}