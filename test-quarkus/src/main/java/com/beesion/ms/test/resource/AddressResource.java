package com.beesion.ms.test.resource;

import com.beesion.ms.model.Address;
import com.beesion.ms.test.dto.AddressDto;

import com.beesion.ms.test.mapper.AddressMapper;
import com.beesion.ms.test.service.impl.AddressService;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/address")
public class AddressResource {

    @Inject
    AddressService addressService;

    @Inject
    AddressMapper addressMapper;

    @POST
    public Response create(AddressDto addressDto) {
        Address address = addressMapper.toEntity(addressDto);
        addressService.save(address);
        return Response.ok("Dirección creada").build();
    }

    @GET
    @Path("/person/{personId}")
    public Response getByPersonId(@PathParam("personId") Long personId) {
        List<Address> addresses = addressService.findByPersonId(personId);
        return Response.ok(addresses).build();
    }
}