package com.reenaz.notebook.model;


import java.util.Date;

public class Note {
    private long id;
    private String title;
    private Date createdDate;
    private String body;

    public Note() {
    }

    public Note(String title, Date createdDate, String body) {
        this.title = title;
        this.createdDate = createdDate;
        this.body = body;
    }

    public Note(long id, String title, Date createdDate, String body) {
        this.id = id;
        this.title = title;
        this.createdDate = createdDate;
        this.body = body;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", createdDate=" + createdDate +
                ", body='" + body + '\'' +
                '}';
    }
}
