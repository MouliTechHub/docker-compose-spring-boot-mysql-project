package in.moulitechhub.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.moulitechhub.binding.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
