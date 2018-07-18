package com.reenaz.notebook.repository;

import com.reenaz.notebook.model.Note;

import java.util.Map;

public interface NoteRepository {

    void save(Note note);

    Note find(Long id);

    Map<Long, Note> findAll();

    void update(Note note);

    void delete(Long id);
}
