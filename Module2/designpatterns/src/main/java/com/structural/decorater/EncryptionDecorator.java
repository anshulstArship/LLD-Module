package com.structural.decorater;

import lombok.AllArgsConstructor;

// Step 4 - Create concrete decorators
public class EncryptionDecorator extends BaseDecorator{
    public EncryptionDecorator(DataSource nextLayer) {
        super(nextLayer);
    }

    @Override
    public String read() {
        return decrypt(nextLayer.read());

    }

    private String decrypt(String read) {
        return read+" Decrypted";
    }

    @Override
    public void write(String value) {
        String result = encrypt(value);
        nextLayer.write(result);

    }

    private String encrypt(String value) {
        return value+ " Encrypted";
    }
}
