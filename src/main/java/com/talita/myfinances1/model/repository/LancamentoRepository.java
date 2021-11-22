package com.talita.myfinances1.model.repository;

import com.talita.myfinances1.model.entity.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
}
