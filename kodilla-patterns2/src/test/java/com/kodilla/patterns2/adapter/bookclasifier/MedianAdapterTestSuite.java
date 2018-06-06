package com.kodilla.patterns2.adapter.bookclasifier;


import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> booksLibrarya = new HashSet<>();
        Book book1 = new Book("Jerzy Kukuczka", "Mój pionowy świat", 2010, "Signature1");
        Book book2 = new Book("Przemysław Wilczyński", "Broad Peak. Niebo i piekło", 2005, "Signature2");
        Book book3 = new Book("Wanda Rutkiewicz", "Na jednej linie", 2000, "Signature3");
        booksLibrarya.add(book1);
        booksLibrarya.add(book2);
        booksLibrarya.add(book3);

        //When
        int medianYearOfPublication = medianAdapter.publicationYearMedian(booksLibrarya);

        //Then
        System.out.println(booksLibrarya.size());
        assertThat(medianYearOfPublication).isEqualTo(2005);
    }
}
