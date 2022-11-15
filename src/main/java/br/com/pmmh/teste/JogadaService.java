package br.com.pmmh.teste;

import br.com.pmmh.teste.model.Jogada;
import br.com.pmmh.teste.repository.JogadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadaService {
    @Autowired
    JogadaRepository jogadaRepository;

    public Jogada find(Long idJogada) {
        return jogadaRepository.findById(idJogada).orElse(null);
    }

    public void save(Jogada jogada) {
        jogadaRepository.save(jogada);
    }

    public List<Jogada> findAll() {
        return jogadaRepository.findAll();
    }

    public void delete(Jogada jogada) {
        jogadaRepository.delete(jogada);
    }

    public Jogada findByIdTabuleiro(Long idTabuleiro) {
        return jogadaRepository.findByIdTabuleiro(idTabuleiro);
    }
}
