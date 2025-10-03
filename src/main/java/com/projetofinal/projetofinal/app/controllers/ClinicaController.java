package com.projetofinal.projetofinal.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.projetofinal.projetofinal.app.models.ClinicaVeterinaria;
import com.projetofinal.projetofinal.app.repository.ClinicaRepository;

@Controller
public class ClinicaController {

    @Autowired
    private ClinicaRepository clinicaRepository;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    // Cadastrar (GET)
    @RequestMapping(value="/cadastrarClinica", method=RequestMethod.GET)
    public String cadastrar() {
        return "cadastrarClinica";
    }

    // Cadastrar (POST)
    @RequestMapping(value="/cadastrarClinica", method=RequestMethod.POST)
    public String cadastrar(ClinicaVeterinaria clinica, @RequestParam("imagemArquivo") MultipartFile imagemArquivo) {
        try {
            if (!imagemArquivo.isEmpty()) {
                String pasta = "src/main/resources/static/img/";
                String nomeArquivo = imagemArquivo.getOriginalFilename();
                Path caminho = Paths.get(pasta + nomeArquivo);
                Files.write(caminho, imagemArquivo.getBytes());
                clinica.setImagemLogo(nomeArquivo);
            }
            clinicaRepository.save(clinica);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/listarClinicas";
    }

    // Listar
    @RequestMapping(value="/listarClinicas", method=RequestMethod.GET)
    public ModelAndView listarClinicas() {
        ModelAndView mv = new ModelAndView("listarClinicas");
        Iterable<ClinicaVeterinaria> clinicas = clinicaRepository.findAll();
        mv.addObject("clinicas", clinicas);
        return mv;
    }

    // Alterar (GET)
    @RequestMapping(value="/alterarClinica/{idClinica}", method=RequestMethod.GET)
    public ModelAndView alterarClinica(@PathVariable("idClinica") long idClinica) {
        ClinicaVeterinaria clinica = clinicaRepository.findById(idClinica).orElse(null);
        ModelAndView mv = new ModelAndView("alterarClinica");
        mv.addObject("clinica", clinica);
        return mv;
    }
}
    // ...adicione aqui outros métodos conforme necessário...
