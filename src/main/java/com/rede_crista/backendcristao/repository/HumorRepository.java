package com.rede_crista.backendcristao.repository;

import com.rede_crista.backendcristao.model.Humor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HumorRepository extends JpaRepository<Humor, Long> {

    @Query(value = "SELECT * FROM humor ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Humor buscarAleatorio();
}