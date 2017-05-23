package com.example.a15017498.demodatabasecrud;

import java.io.Serializable;

/**
 * Created by 15017498 on 23/5/2017.
 */

public class Note implements Serializable {

    private int id;
    private String noteContent;


    public Note(int id, String noteContent) {
        this.id = id;
        this.noteContent = noteContent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }
}
