package com.reenaz.notebook.controller;


import com.reenaz.notebook.model.Note;
import com.reenaz.notebook.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoteController {

    @Autowired
    NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @RequestMapping(value = "/note", method = RequestMethod.GET)
    public Note get(long id) {
        return noteService.find(id);
    }

    @RequestMapping(value = "/note", method = RequestMethod.POST)
    public void add(Note note) {
        noteService.save(note);
    }

    @RequestMapping(value = "/note", method = RequestMethod.PUT)
    public void update(Note note) {
        noteService.update(note);
    }

    @RequestMapping(value = "/note", method = RequestMethod.DELETE)
    public void delete(long id) {
        noteService.delete(id);
    }

    @RequestMapping(value = "/notes", method = RequestMethod.GET)
    public List<Note> getAll() {
        return noteService.findAll();
    }



}
