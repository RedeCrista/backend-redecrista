package com.rede_crista.backendcristao.repository;

import com.rede_crista.backendcristao.model.Humor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HumorRepository extends JpaRepository<Humor, Long> {
}
