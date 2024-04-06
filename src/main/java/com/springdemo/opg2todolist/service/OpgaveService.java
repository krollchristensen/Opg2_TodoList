package com.springdemo.opg2todolist.service;



import com.springdemo.opg2todolist.model.Opgave;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class OpgaveService {
    private final List<Opgave> opgaver = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    public void tilfoejOpgave(Opgave opgave) {
        opgave.setId(counter.incrementAndGet());
        opgaver.add(opgave);
    }

    public List<Opgave> hentAlleOpgaver() {
        return opgaver;
    }
}
