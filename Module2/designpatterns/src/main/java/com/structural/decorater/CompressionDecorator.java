package com.structural.decorater;

public class CompressionDecorator extends BaseDecorator{
    public CompressionDecorator(DataSource nextLayer) {
        super(nextLayer);
    }

    @Override
    public String read() {
        return decompress(nextLayer.read());
    }

    private String decompress(String read) {
        return read+" Decompress";
    }

    @Override
    public void write(String value) {
        String ans = compressed(value);
        nextLayer.write(ans);

    }

    private String compressed(String value) {
        return value+"Compressed";
    }
}
