package com.api.apiproject.dao;

import com.api.apiproject.model.Person;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {

    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person)
    {
        UUID newId = UUID.randomUUID();
        return insertPerson(newId, person);
    }

    Optional<Person> selectPersonById(UUID id);

    List<Person> selectAllPeople();

    int deletePerson(UUID id);

    int updatePerson(UUID id, Person person);
}
