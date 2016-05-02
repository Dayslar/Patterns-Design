package test.strategy;

import java.io.File;

public class FileAuth implements AuthStrategy {

    private File file;

    public FileAuth(String text) {
        this.file = new File(text);
    }

    @Override
    public boolean checkLogin(String name, String password) {
        System.out.println("Checking with file....");
        return checkFromFile();
    }

    private boolean checkFromFile() {
        return true;
    }
}
