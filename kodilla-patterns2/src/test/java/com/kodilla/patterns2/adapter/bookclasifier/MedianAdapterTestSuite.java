package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclassifier.MedianAdapter;
import org.junit.Test;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Author1","Title1", 1960, "01"));
        books.add(new Book("Author2","Title2", 1980, "02"));
        books.add(new Book("Author3","Title3", 2000, "03"));
        books.add(new Book("Author4","Title4", 2005, "04"));
        books.add(new Book("Author5","Title5", 2015, "05"));

        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int median = medianAdapter.publicationYearMedian(books);
        //Then
        System.out.println("The publication year median is: " + median);
        assertEquals(2000, median);
    }

}
