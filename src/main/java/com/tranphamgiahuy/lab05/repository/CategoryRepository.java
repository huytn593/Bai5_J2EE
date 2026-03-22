package com.tranphamgiahuy.lab05.repository;

import com.tranphamgiahuy.lab05.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
