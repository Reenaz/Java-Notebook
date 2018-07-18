package com.reenaz.notebook.controller;


import com.reenaz.notebook.model.Note;
import com.reenaz.notebook.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteController {

    @Autowired
    NoteService noteService;

    @RequestMapping(value = "/note", method = RequestMethod.GET)
    public Note get(long id) {

        return null;
    }

    @RequestMapping(value = "/note", method = RequestMethod.POST)
    public void add(Note note) {

    }

    @RequestMapping(value = "/note", method = RequestMethod.PUT)
    public void update(Note note) {

    }

    @RequestMapping(value = "/note", method = RequestMethod.DELETE)
    public void delete(long id) {

    }

}
