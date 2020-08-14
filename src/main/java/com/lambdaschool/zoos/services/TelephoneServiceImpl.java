package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.Telephone;
import com.lambdaschool.zoos.repository.TelephoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "telephoneService")
public class TelephoneServiceImpl implements TelephoneService{
    @Autowired
    private TelephoneRepository phonerepos;
    @Autowired
    private ZooService zoorepos;

    @Override
    public List<Telephone> findAll()
    {
        List<Telephone> list = new ArrayList<>();
        phonerepos.findAll()
                .iterator()
                .forEachRemaining(list::add);
        return list;
    }

    @Override
    public Telephone findPhoneById(long id)
    {
        return phonerepos.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Phone with id " + id + " Not Found!"));
    }
}
