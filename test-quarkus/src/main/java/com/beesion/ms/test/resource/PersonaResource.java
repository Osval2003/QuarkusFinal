package com.beesion.ms.test.resource;

import com.beesion.ms.model.Address;
import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.PersonDto;
import com.beesion.ms.test.mapper.PersonMapper;
import com.beesion.ms.test.service.impl.AddressService;
import com.beesion.ms.test.service.impl.PersonService;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/person")
public class PersonaResource {

	@Inject
	PersonService personService;

	@Inject
	PersonMapper personMapper;

	@Inject
	AddressService addressService;  // Servicio inyectado

	@POST
	public Response save(PersonDto per) {
		Person person = personMapper.toEntity(per);
		personService.save(person);
		return Response.ok("Elemento guardado").build();
	}

	@GET
	@Path("{id}")
	public Response getById(@PathParam("id") Long id) {
		// Implementar según necesidad
		return Response.ok().build();
	}

	@GET
	@Path("{id}/addresses")
	public Response getPersonAddresses(@PathParam("id") Long id) {
		List<Address> addresses = addressService.findByPersonId(id);  // Llamada correcta
		return Response.ok(addresses).build();
	}
}
/*package com.beesion.ms.test.resource;

import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.PersonDto;
import com.beesion.ms.test.service.impl.PersonService;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/Person")
public class PersonaResource {

	@Inject
	PersonService person;

	@POST
	public Response save(PersonDto per) {
		Person p = new Person();
		p.setName(per.getName());
		person.save(p);
		
		return Response.ok("Elemento guardado").build();
	}

}*/
