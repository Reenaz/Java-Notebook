package com.reenaz.notebook.repository.impl;

import com.reenaz.notebook.model.Note;
import com.reenaz.notebook.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Map;

@Repository
public class NoteRepositoryImpl implements NoteRepository{
    private static final String KEY = "Notes";

    private RedisTemplate<String, Object> redisTemplate;
    private HashOperations<String, Long, Note> hashOperations;

    @Autowired
    public NoteRepositoryImpl(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @PostConstruct
    private void init() {
        hashOperations = redisTemplate.opsForHash();
    }

    @Override
    public void save(Note note) {
        hashOperations.put(KEY, note.getId(), note);
    }

    @Override
    public Note find(Long id) {
        return hashOperations.get(KEY, id);
    }

    @Override
    public Map<Long, Note> findAll() {
        return hashOperations.entries(KEY);
    }

    @Override
    public void update(Note note) {
        System.out.println("updating note: " + note);
        hashOperations.put(KEY, note.getId(), note);
    }

    @Override
    public void delete(Long id) {
        hashOperations.delete(KEY, id);
    }
}
