package com.reenaz.notebook.service;

import com.reenaz.notebook.model.Note;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NoteService {

    List<Note> findAll();

    Note find(long id);

    void save(Note note);

    void update(Note note);

    void delete(long id);

}
