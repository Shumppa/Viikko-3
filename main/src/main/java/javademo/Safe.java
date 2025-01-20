package javademo;

import java.util.ArrayList;

public class Safe {
    private String pinCode;
    private ArrayList<String> Safe;

    public Safe(String password) {
        this.pinCode = password;
        this.Safe = new ArrayList<String>();
    }

    public void changePassword(String newPincode) {
        this.pinCode = newPincode;
    }

    public void addToFolder(String data) {
        Safe.add(data);
    }

    public ArrayList<String> listFolder(String enteredPincode) {
        if (enteredPincode.equals(pinCode)) {
            return Safe;
        } else {
            return null;
        }
    }
}
