package com.company.gamestore.Repositories;

import com.company.gamestore.Models.TShirt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TShirtRepository extends JpaRepository<TShirt, Integer> {
    List<TShirt> findByColor(String color);
    List<TShirt> findBySize(String size);
}
