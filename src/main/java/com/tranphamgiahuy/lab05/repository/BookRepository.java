package com.tranphamgiahuy.lab05.repository;

import com.tranphamgiahuy.lab05.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
