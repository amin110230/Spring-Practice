package com.amin.service;

import com.amin.model.Speaker;
import com.amin.repository.HibernateSpeakerRepositoryImpl;
import com.amin.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

//    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
    }

    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) { // not working for autowire as byName but byType
        this.repository = repository;
    }

//    public void setSpeakerRepository(SpeakerRepository repository) { // working for autowire as byName
//        this.repository = repository;
//    }
}
