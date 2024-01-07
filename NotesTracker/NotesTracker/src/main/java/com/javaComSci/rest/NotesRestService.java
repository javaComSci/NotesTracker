package com.javaComSci.rest; // Note your package will be {{ groupId }}.rest

import com.javaComSci.entity.Note;
import com.javaComSci.services.NoteService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class NotesRestService {
    @GET
    @Path("/notes")
    public Response hello() {
        return Response.status(200).entity("notes!").build();
    }

    @GET
    @Path("/note")
    public Response createRandomNote() {
        NoteService noteService = new NoteService();
        Note n = new Note();
        n.setValue("HI!");
        n = noteService.createNote(n);
        return Response.status(200).build();
    }
}