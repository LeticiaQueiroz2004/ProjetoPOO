package br.senac.sp.series.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senac.sp.series.model.Serie;
import br.senac.sp.series.repository.SerieRepository;
import jakarta.validation.Valid;

@Controller
@RequestMapping("series")
public class SeriesController {
   
    @Autowired 
    SerieRepository repository;

    @GetMapping
    public String index(Model model) {
        var lista = repository.findAll();
        model.addAttribute("series", lista);
        return "series/index";
    }

    @GetMapping("form")
    public String form(Serie serie) {
        return "series/form";
    }

    @PostMapping("form")
    public String save(@Valid Serie serie, BindingResult result) {
        if(result.hasErrors()) return "series/form";

        repository.save(serie);

        return "redirect:/series";
    }

}
