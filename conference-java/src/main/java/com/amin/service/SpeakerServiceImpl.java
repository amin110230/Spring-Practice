package com.amin.service;

import com.amin.model.Speaker;
import com.amin.repository.HibernateSpeakerRepositoryImpl;
import com.amin.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

//    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
    private SpeakerRepository repository;

    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {    // for Constructor Injection
        this.repository = speakerRepository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {   // for setter Injection
        this.repository = repository;
    }

}
