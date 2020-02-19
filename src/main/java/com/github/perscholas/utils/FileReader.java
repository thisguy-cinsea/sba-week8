package com.github.perscholas.utils;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author leonhunter
 * @created 02/12/2020 - 6:26 PM
 * used to convert files contents to String
 */
public class FileReader extends Reader {

    private final String filename;

    public FileReader(String filename) {
        this.filename = filename;
    }

    @Override
//    public String toString() {
//        ClassLoader classLoader = getClass().getClassLoader();
//        File file = new File(classLoader.getResource(filename).getFile());
//        StringBuilder result = new StringBuilder();
//        try (Scanner scanner = new Scanner(file)) {
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                result.append(line).append("\n");
//            }
//        } catch (IOException e) {
//            throw new Error(e);
//        }
//        return result.toString();
//    }
    public String toString() {
        try {
            byte[] readAllBytes = java.nio.file.Files.readAllBytes(Paths.get( filename ));
            return new String( readAllBytes );
        } catch (IOException e) {
            throw new Error(e);
        }
    }

    @Override
    public int read(char[] chars, int i, int i1) throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {

    }
}

