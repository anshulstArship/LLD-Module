package com.structural.decorater;

public interface DataSource {
    String read();
    void write(String value);
}
