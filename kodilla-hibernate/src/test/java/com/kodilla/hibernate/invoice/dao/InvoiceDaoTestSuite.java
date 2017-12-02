package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;


    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Candies");
        Product product1 = new Product("Cookies");

        Item item = new Item(1000, new BigDecimal(20), new BigDecimal(2000));
        Item item1 = new Item(500, new BigDecimal(20), new BigDecimal(1000));

        item.setProduct(product);
        item1.setProduct(product1);

        product.getItems().add(item);
        product.getItems().add(item1);

        Invoice invoice = new Invoice("INV/12/0001");

        item.setInvoice(invoice);
        item1.setInvoice(invoice);

        invoice.getItems().add(item);
        invoice.getItems().add(item1);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.delete(id);

    }
}

