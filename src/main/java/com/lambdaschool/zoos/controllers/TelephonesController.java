package com.lambdaschool.zoos.controllers;

import com.lambdaschool.zoos.services.TelephoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TelephonesController {
    @Autowired
    TelephoneService telephoneService;

}
