package com.example.springDemo.data.entities;

public class Message {

    private long id;
    private String text;

    public Message (Long id, String text) {
        this.id = id;
        this.text = text;
    }

    public long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message {id=" + getId() + ", text=" + getText();
    }
}