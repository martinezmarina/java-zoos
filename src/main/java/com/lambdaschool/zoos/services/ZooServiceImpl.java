package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.Zoo;
import com.lambdaschool.zoos.repository.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "zooService")
public class ZooServiceImpl implements ZooService{
        @Autowired
        private ZooRepository zoorepos;

        @Override
        public Zoo findZooById(long id) throws
        EntityNotFoundException
        {
            return zoorepos.findById(id)
                    .orElseThrow(() -> new EntityNotFoundException("Zoo id " + id + " not found!"));
        }

        @Override
        public List<Zoo> findAll()
        {
            List<Zoo> list = new ArrayList<>();
            zoorepos.findAll()
                    .iterator()
                    .forEachRemaining(list::add);
            return list;
        }
}
