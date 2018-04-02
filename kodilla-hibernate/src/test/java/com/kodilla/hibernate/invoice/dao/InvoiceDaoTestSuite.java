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
    public void testInvoiceDaoSave(){
        //Given
        Product product1 =new Product("Ski");
        Product product2 =new Product("Snowboard");
        Product product3 =new Product("Skates");
        Item item1 = new Item(product1, new BigDecimal(2500), 1, new BigDecimal(2500));
        Item item2 = new Item(product2, new BigDecimal(3500), 1, new BigDecimal(3500));
        Item item3 = new Item(product3, new BigDecimal(1500), 1, new BigDecimal(1500));
        Invoice invoice = new Invoice("FV01-04/2018");
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Than
        Assert.assertNotEquals(0, invoiceId);

        //CleanUp
        invoiceDao.deleteAll();
    }
}
