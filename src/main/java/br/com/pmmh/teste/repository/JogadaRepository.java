package br.com.pmmh.teste.repository;

import br.com.pmmh.teste.model.Jogada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadaRepository extends JpaRepository<Jogada, Long> {
    Jogada findByIdTabuleiro(Long idTabuleiro);
}
