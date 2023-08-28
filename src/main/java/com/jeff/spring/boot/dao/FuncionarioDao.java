package com.jeff.spring.boot.dao;

import com.jeff.spring.boot.domain.Funcionario;

import java.time.LocalDate;
import java.util.List;

public interface FuncionarioDao {
    void save(Funcionario funcionario);
    void update(Funcionario funcionario);
    void delete(Long id);
    Funcionario findById(Long id);
    List<Funcionario> findAll();
    List<Funcionario> findByNome(String nome);

    List<Funcionario> findByCargoId(Long id);

    List<Funcionario> findByDataEntradaDataSaida(LocalDate entrada, LocalDate saida);

    List<Funcionario> findByDataentrada(LocalDate entrada);

    List<Funcionario> findByDataSaida(LocalDate saida);
}
