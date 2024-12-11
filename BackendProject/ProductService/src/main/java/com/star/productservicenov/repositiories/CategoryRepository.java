package com.star.productservicenov.repositiories;

import com.star.productservicenov.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category,Long> {

    @Override
    Optional<Category> findById(Long id);
    @Override
    Category save(Category category);

    Optional<Category> findByValue(String value);


}
