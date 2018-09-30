package com.reenaz.notebook.service.impl;

import com.reenaz.notebook.model.Note;
import com.reenaz.notebook.model.requests.NoteUpdateReq;
import com.reenaz.notebook.repository.NoteRepository;
import com.reenaz.notebook.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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
//        List<Note> products = new ArrayList<>();
//        noteRepository.findAll().forEach(products::add); //fun with Java 8
     //   return products;
    }

    @Override
    public Note find(long id) {
        return noteRepository.find(id);
    }

    @Override
    @Transactional
    public Note save(Note note) {
        note.setId();
        noteRepository.save(note);
        return note;

    }

    @Override
    @Transactional
    public Note update(NoteUpdateReq noteReq) {
        System.out.println("Note for update: " + noteReq);
        Note note = noteRepository.find(noteReq.getId());
        note.setTitle(noteReq.getTitle());
        note.setContent(noteReq.getContent());
        noteRepository.update(note);
        return note;
    }

    @Override
    public void delete(long id) {
        noteRepository.delete(id);
    }
}
