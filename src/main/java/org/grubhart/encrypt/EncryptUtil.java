package org.grubhart.encrypt;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.util.text.StrongTextEncryptor;

/**
 * Created by edson.chavez on 15/07/2015.
 */
public class EncryptUtil {

    private final StandardPBEStringEncryptor encryptor;

    public EncryptUtil() {
        super();
        this.encryptor = new StandardPBEStringEncryptor();
        this.encryptor.setAlgorithm("PBEWithMD5AndDES");
    }

    public String encrypt(String message) {
        return this.encryptor.encrypt(message);
    }

    public void setPassword(String password){
        this.encryptor.setPassword(password);
    }

    public String decrypt(String encryptedMessage){
        return this.encryptor.decrypt(encryptedMessage);
    }
}
