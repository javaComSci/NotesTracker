package com.javaComSci.services;

import com.javaComSci.entity.Note;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class NoteService {

    public Note createNote(Note note) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("notesPU");
        EntityManager em;
        EntityTransaction tx;
        em = emf.createEntityManager();
        tx = em.getTransaction();

        tx.begin();
        em.persist(note);
        tx.commit();

        if (em != null) em.close();

        return note;
    }

}
