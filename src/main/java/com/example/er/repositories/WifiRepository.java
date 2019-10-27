package com.example.er.repositories;

import com.example.er.models.WIFI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WifiRepository extends JpaRepository<WIFI, Integer> {
}
