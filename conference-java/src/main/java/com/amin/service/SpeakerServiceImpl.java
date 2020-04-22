package com.amin.service;

import com.amin.model.Speaker;
import com.amin.repository.HibernateSpeakerRepositoryImpl;
import com.amin.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService") // used stereotype
public class SpeakerServiceImpl implements SpeakerService {

//    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {    // for Constructor Injection
        System.out.println("SpeakerServiceImpl repository constructor");
        this.repository = speakerRepository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }

//    @Autowired
    public void setRepository(SpeakerRepository repository) {   // for setter Injection
        System.out.println("SpeakerServiceImpl setter");
        this.repository = repository;
    }

}
