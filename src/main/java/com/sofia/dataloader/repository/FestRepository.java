package com.sofia.dataloader.repository;

import com.sofia.dataloader.domain.Fest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FestRepository extends JpaRepository<Fest, String> {
}
