package com.example.demo.controller;

import com.example.demo.entity.Streetfighter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class StreetfighterController {

    @Autowired
    StreetfighterService streetfighterService;
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<Streetfighter>> getAll() {


        return ResponseEntity.ok(streetfighterService.getAll());
    }
}
