package com.jeff.spring.boot.dao;

import com.jeff.spring.boot.domain.Cargo;
import com.jeff.spring.boot.util.PaginacaoUtil;

import java.util.List;

public interface CargoDao {
    void save(Cargo cargo);

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();

    PaginacaoUtil<Cargo> buscaPaginada(int pagina, String direcao);
}
