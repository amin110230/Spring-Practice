package com.amin.repository;

import com.amin.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository") // used stereotype in implementation not in interface
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Md Aminul");
        speaker.setLastName("Islam");

        speakers.add(speaker);

        return speakers;
    }
}
