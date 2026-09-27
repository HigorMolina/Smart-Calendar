package webagenda.agenda.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import webagenda.agenda.web.model.Agenda;
import webagenda.agenda.web.repository.AgendaRepository;

import java.util.List;

@Controller
public class AgendaController {

    private final AgendaRepository repository;

    public AgendaController(AgendaRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String exibirHome(Model model) {
        List<Agenda> agendas = repository.findAll();

        model.addAttribute("listaDeCompromissos", agendas);
        return "index";
    }
}