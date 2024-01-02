package com.nelioalves.cursomc.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domian.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
