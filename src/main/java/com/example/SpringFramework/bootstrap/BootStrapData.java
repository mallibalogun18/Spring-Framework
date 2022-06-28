package com.example.SpringFramework.bootstrap;

import com.example.SpringFramework.model.Author;
import com.example.SpringFramework.model.Book;
import com.example.SpringFramework.model.Publisher;
import com.example.SpringFramework.repository.AuthorRepository;
import com.example.SpringFramework.repository.BookRepository;
import com.example.SpringFramework.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        //create an author and a book
        Author eric = new Author("Dale", "Carnegie");
        Book friendsInfluence = new Book("How to win friends and influence people","1234512");
        Publisher publisher = new Publisher("Akashic Book","810 West Grace", "Chicago", "Illinois", "60613");
        eric.getBooks().add(friendsInfluence);
        friendsInfluence.getAuthors().add(eric);

        //save both Entities into they respective repository
        publisherRepository.save(publisher);
        authorRepository.save(eric);
        bookRepository.save(friendsInfluence);

        System.out.println("Started BootStrap Data");
        System.out.println("Number of Books: "+bookRepository.count());
        System.out.println("Number of Publisher: "+publisherRepository.count());

    }
}
