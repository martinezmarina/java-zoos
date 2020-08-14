package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.Animal;
import com.lambdaschool.zoos.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "animalService")
public class AnimalServiceImpl implements AnimalService{
    @Autowired
    AnimalRepository animalrepos;

    @Override
    public List<Animal> getAnimalCount(){
        List<Animal> list = animalrepos.getAnimalCount();
        return list;
    }

}
