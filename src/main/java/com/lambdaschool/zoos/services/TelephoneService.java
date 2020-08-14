package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.Telephone;

import java.util.List;

public interface TelephoneService {
    List<Telephone> findAll();
    Telephone findPhoneById(long id);
}
