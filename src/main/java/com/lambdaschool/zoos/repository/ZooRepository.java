package com.lambdaschool.zoos.repository;

import com.lambdaschool.zoos.models.Zoo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ZooRepository extends CrudRepository<Zoo, Long> {
    Zoo findByName(String name);
    List<Zoo> findByNameContainingIgnoreCase(String name);
}
