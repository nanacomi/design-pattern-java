package adapter.exercise;

import java.io.*;
import java.util.*;

public class FileProperties extends Properties implements FileIO {

    public void readFromFile(String filename) throws IOException {
        InputStream fileStream = new FileInputStream(filename);
        super.load(fileStream);
    }

    public void writeToFile(String filename) throws IOException {
        OutputStream fileStream = new FileOutputStream(filename);
        super.store(fileStream, "");
    }

    public void setValue(String key, String value) {
        super.setProperty(key, value);
    }

    public String getValue(String key) {
        return super.getProperty(key);
    }
}