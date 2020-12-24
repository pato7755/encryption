package endpoints;

import models.EncryptionSHAmodel;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.web.bind.annotation.*;
import utilities.Utilities;

import javax.validation.Valid;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;

@RestController
@RequestMapping(path = "/encrypt")
public class Encrypt {

    @PostMapping(path = "/sha", produces = "application/json")
    public String encryption(
            @RequestBody EncryptionSHAmodel shaModel) {

        String input = shaModel.getInput();
        String key = shaModel.getKey();
        String encryptedString = "";

        Utilities utilities = new Utilities();
        try {
            encryptedString = utilities.encodeSHA256withRSA(key, input);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Exception: " + ex.getMessage());
        }

        return encryptedString;
    }



}
