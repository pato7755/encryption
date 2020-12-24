package utilities;

import org.apache.tomcat.util.codec.binary.Base64;

import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;

public class Utilities {

    public String encodeSHA256withRSA(String key, String input) throws Exception {
        byte[] data = input.getBytes(StandardCharsets.UTF_8);
        byte[] keyBytes = Base64.decodeBase64(key);
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PrivateKey privateKey = keyFactory.generatePrivate(keySpec);

        Signature sign = Signature.getInstance("SHA256withRSA");
        sign.initSign(privateKey);
        sign.update(data);
        byte[] signed = sign.sign();
        return Base64.encodeBase64String(signed);
    }




}
