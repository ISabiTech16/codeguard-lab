package com.lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileService {
    private static final String UPLOAD_DIR = "/data/uploads/";

    public String read(String fileName) throws IOException {
        Path path = Path.of(UPLOAD_DIR + fileName);
        return Files.readString(path);
    }
}
