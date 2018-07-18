package com.reenaz.notebook.service.impl;

import com.reenaz.notebook.model.Note;
import com.reenaz.notebook.service.NoteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    @Override
    public List<Note> findAll() {
        return null;
    }

    @Override
    public Note find(long id) {
        return null;
    }

    @Override
    public void save(Note note) {

    }

    @Override
    public void update(Note note) {

    }

    @Override
    public void delete(long id) {

    }
}
