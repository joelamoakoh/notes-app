package controllers

import models.Note

class NoteAPI {
    fun add(note: Note): Boolean {
        return notes.add(note)
    }

    private var notes = ArrayList<Note>()

    fun listAllNotes():
            String {
        return if (notes.isEmpty()){
            "No notes stored"
        }
        else {
            var listOfNotes = ""
            for(i in notes.indices){
                listOfNotes += "${i}: ${notes[i]} \n"
            }
            listOfNotes
        }
    }
}