package com.springdemo.opg2todolist.controller;
import com.springdemo.opg2todolist.service.OpgaveService;
import com.springdemo.opg2todolist.model.Opgave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/opgaver")
public class OpgaveController {

    @Autowired
    private OpgaveService opgaveService;

    @GetMapping
    public String visOpgaver(Model model) {
        model.addAttribute("opgaver", opgaveService.hentAlleOpgaver());
        model.addAttribute("nyOpgave", new Opgave(0L, ""));
        return "opgaver";
    }

    @PostMapping
    public String tilfoejOpgave(Opgave opgave) {
        opgaveService.tilfoejOpgave(opgave);
        return "redirect:/opgaver";
    }
}
