package me.whiteship.demojpacustom;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BookRepositoryTest {

    @Autowired
    BookRepository bookRepository;

    @Test
    public void test() {
        Book book = new Book();
        book.setTitle("spring");
        book.setContent("data");
        bookRepository.save(book);

        assertEquals(1, bookRepository.findAll().size());
    }

}