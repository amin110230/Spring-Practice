package com.amin.service;

import com.amin.model.Speaker;
import com.amin.repository.HibernateSpeakerRepositoryImpl;
import com.amin.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
