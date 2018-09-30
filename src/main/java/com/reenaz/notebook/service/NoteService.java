package com.reenaz.notebook.service;

import com.reenaz.notebook.model.Note;
import com.reenaz.notebook.model.requests.NoteUpdateReq;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NoteService {

    List<Note> findAll();

    Note find(long id);

    Note save(Note note);

    Note update(NoteUpdateReq note);

    void delete(long id);

}
