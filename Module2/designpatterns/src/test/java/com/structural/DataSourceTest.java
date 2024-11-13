package com.structural;

import com.structural.decorater.DataSource;
import com.structural.decorater.EncryptionDecorator;
import com.structural.decorater.FileDataSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataSourceTest {

    @Test
    void readDB(){
        DataSource source = new FileDataSource();
        Assertions.assertEquals("Base",source.read(),"Base should be returned");

    }

    @Test
    void testEncryption(){
        DataSource file = new FileDataSource();
        DataSource data = new EncryptionDecorator(file);
        Assertions.assertEquals("Base Decrypted",data.read(),"Base should be returned");
    }
}
