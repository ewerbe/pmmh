package br.com.pmmh.teste.controller;

import br.com.pmmh.teste.JogadaService;
import br.com.pmmh.teste.model.Jogada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @Autowired
    private JogadaService jogadaService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndex(Model model,
                           @RequestParam(value = "idTabuleiro", required = false)Long idTabuleiro) {

        if(idTabuleiro != null) {
            if(jogadaService.findByIdTabuleiro(idTabuleiro) == null) {
                Jogada jogada = new Jogada(idTabuleiro, true);
                jogadaService.save(jogada);
                model.addAttribute("responderCarta", true);
                return "carta";
            }  else {
                model.addAttribute("responderCarta", false);
                return "carta";
            }
        }
        return "home";
    }
}
