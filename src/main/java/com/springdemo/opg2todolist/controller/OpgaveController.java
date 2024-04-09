package com.springdemo.opg2todolist.controller;

import com.springdemo.opg2todolist.service.OpgaveService;
import com.springdemo.opg2todolist.model.Opgave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * OpgaveController-klassen er en Spring MVC Controller, der håndterer HTTP-anmodninger for at administrere opgaver (Opgaver).
 * Den interagerer med OpgaveService for at udføre operationer og opdaterer visningen i overensstemmelse hermed.
 */
@Controller
@RequestMapping("/opgaver") //istedet for at skrive /opgaver i GetMapping/og post kun en side
public class OpgaveController {

    @Autowired
    private OpgaveService opgaveService;

    /**
     * Viser alle opgaverne ved at tilføje dem til modellen, som bruges til at vise opgaverne i visningen.
     * En ny tom opgave tilføjes også til modellen for at kunne indføres via formularen i visningen.
     * @param model Spring MVC Model bruges til at tilføje attributter, som visningen kan tilgå.
     * @return En streng der angiver navnet på den HTML-skabelon, der skal vises (opgaver.html).
     */
    @GetMapping
    public String visOpgaver(Model model) {
        model.addAttribute("opgaver", opgaveService.hentAlleOpgaver());
        model.addAttribute("nyOpgave", new Opgave(0L, ""));
        return "opgaver";
    }

    /**
     * Håndterer indsendelsen af en ny opgave via POST-anmodning. Den nye opgave tilføjes til listen over opgaver.
     * Efter tilføjelsen omdirigeres brugeren tilbage til opgavelisten.
     * @param opgave Den opgave, der skal tilføjes.
     * @return En streng der angiver en omdirigering til opgavelisten.
     */
    @PostMapping
    public String tilfoejOpgave(Opgave opgave) {
        opgaveService.tilfoejOpgave(opgave);
        return "redirect:/opgaver";
    }
}
