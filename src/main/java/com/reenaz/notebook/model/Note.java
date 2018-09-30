package com.reenaz.notebook.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@RedisHash("notes")
public class Note  implements Serializable {
    private static final long serialVersionUID = 1L;
    private static long idCounter = 0;

    private Long id;
    private String title;
    private long createdDate;
    private String content;
    private List<String> tags;

    public Note() {
    }

    public Note(String title, String content, List<String> tags) {
        this.title = title;
        this.createdDate = new Date().getTime();
        this.content = content;
        this.tags = tags;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setId() {
        this.id = idCounter++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(long createdDate) {
        this.createdDate = createdDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getTags() {
        if(null != tags ){
            return tags;
        }else{
            return Collections.emptyList();
        }

    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return createdDate == note.createdDate &&
                Objects.equals(id, note.id) &&
                Objects.equals(title, note.title) &&
                Objects.equals(content, note.content) &&
                Objects.equals(tags, note.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, createdDate, content, tags);
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", createdDate=" + createdDate +
                ", content='" + content + '\'' +
                ", tags=" + tags +
                '}';
    }
}
