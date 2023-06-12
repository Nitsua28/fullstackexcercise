package com.example.demo.service;

import com.example.demo.entity.Streetfighter;
import com.example.demo.repository.StreetfighterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreetfighterServiceImpl implements StreetfighterService {
    @Autowired
    StreetfighterRepository streetfighterRepository;
    @Override
    public List<Streetfighter> getAll() {return streetfighterRepository.findAll();}
}
