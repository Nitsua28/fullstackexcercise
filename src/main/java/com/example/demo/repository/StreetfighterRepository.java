package com.example.demo.repository;

import com.example.demo.entity.Streetfighter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreetfighterRepository extends JpaRepository<Streetfighter, Long> {

}
