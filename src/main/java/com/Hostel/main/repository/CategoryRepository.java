package com.Hostel.main.repository;

import com.Hostel.main.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
