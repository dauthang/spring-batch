package com.example.springbatch.repositories;

import com.example.springbatch.entities.Coin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListCoinRepository extends JpaRepository<Coin, Long> {

}
