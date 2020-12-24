package models;

public class EncryptionSHAmodel {

    private String input;
    private String key;

    public EncryptionSHAmodel(String input, String key) {
        this.input = input;
        this.key = key;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
