package com.example.restservice;

// Resource Representation Class - A POJO with accessors and constructor
public class Greeting {

    // the unique identifier for the greeting
    private final long id;
    // the textual representation of the greeting
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
