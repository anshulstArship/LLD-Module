package com.creational;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConnectionPoolTest {

    @Test
    public void testConstructor(){
        ConnectionPool conn1 = ConnectionPool.getInstance();
        ConnectionPool conn2 = ConnectionPool.getInstance();
        assertEquals(conn1,conn2);

    }
}
