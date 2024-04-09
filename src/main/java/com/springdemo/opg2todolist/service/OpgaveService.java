package com.springdemo.opg2todolist.service;

import com.springdemo.opg2todolist.model.Opgave;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * OpgaveService-klassen tilbyder service-metoder til at håndtere logikken bag opgavelisten.
 * Den indeholder en liste over opgaver og en tæller til at generere unikke id'er for nye opgaver.
 */
@Service
public class OpgaveService {
    private final List<Opgave> opgaver = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    /**
     * Tilføjer en ny opgave til listen over opgaver med et unikt id.
     * @param opgave Den opgave, der skal tilføjes.
     */
    public void tilfoejOpgave(Opgave opgave) {
        opgave.setId(counter.incrementAndGet());
        opgaver.add(opgave);
    }

    /**
     * Returnerer en liste over alle opgaverne.
     * @return En liste af Opgave-objekter.
     */
    public List<Opgave> hentAlleOpgaver() {
        return opgaver;
    }
}
