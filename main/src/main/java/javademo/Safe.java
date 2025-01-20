package javademo;

import java.util.ArrayList;

public class Safe {
    private String password;
    private ArrayList<String> safeFolder;

    public Safe(String password) {
        this.password = password;
        this.safeFolder = new ArrayList<String>();
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    public void addToFolder(String data) {
        safeFolder.add(data);
    }

    public ArrayList<String> listFolder(String enteredPassword) {
        if (enteredPassword.equals(password)) {
            return safeFolder;
        } else {
            return null;
        }
    }
}
