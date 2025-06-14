package com.beesion.ms.test.service;

import com.beesion.ms.model.Person;

public interface IPersonService {
	Person save(Person per);  // Cambiado de void a Person
}