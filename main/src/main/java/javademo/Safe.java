package javademo;

import java.util.ArrayList;

public class Safe {
    private String pinCode;
    private ArrayList<String> safeFolder;

    public Safe(String password) {
        this.pinCode = password;
        this.safeFolder = new ArrayList<String>();
    }

    public void changePassword(String newPincode) {
        this.pinCode = newPincode;
    }

    public void addToFolder(String data) {
        safeFolder.add(data);
    }

    public ArrayList<String> listFolder(String enteredPincode) {
        if (enteredPincode.equals(pinCode)) {
            return safeFolder;
        } else {
            return null;
        }
    }
}
