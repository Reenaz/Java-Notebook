package com.reenaz.notebook.service.impl;

import com.reenaz.notebook.model.Note;
import com.reenaz.notebook.repository.NoteRepository;
import com.reenaz.notebook.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    NoteRepository noteRepository;

    public NoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public List<Note> findAll() {
        return new LinkedList<>(noteRepository.findAll().values());
    }

    @Override
    public Note find(long id) {
        return noteRepository.find(id);
    }

    @Override
    public void save(Note note) {
        noteRepository.save(note);
    }

    @Override
    public void update(Note note) {
        noteRepository.update(note);
    }

    @Override
    public void delete(long id) {
        noteRepository.delete(id);
    }
}
