package com.reenaz.notebook.controller;


import com.reenaz.notebook.model.Note;
import com.reenaz.notebook.model.requests.NoteUpdateReq;
import com.reenaz.notebook.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class NoteController {

    @Autowired
    NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @RequestMapping(value = "/note/{id}", method = RequestMethod.GET)
    public Note get(@PathVariable("id") long id) {
        return noteService.find(id);
    }

    @RequestMapping(value = "/note", method = RequestMethod.POST)
    public Note add(@RequestBody Note note) {
        System.out.println(note);
        note.setCreatedDate(new Date().getTime());
        return noteService.save(note);
    }

    @RequestMapping(value = "/note", method = RequestMethod.PUT)
    public void update(@RequestBody NoteUpdateReq note) {
        noteService.update(note);
    }

    @RequestMapping(value = "/note/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") long id) {
        noteService.delete(id);
    }

    @RequestMapping(value = "/notes", method = RequestMethod.GET)
    public List<Note> getAll() {
        return noteService.findAll();
    }



}
