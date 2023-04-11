package com.example.strings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindText {

    private String fileName = "gettys.html";
    // Create Pattern
    private Pattern pattern;
    // Create Matcher
    private Matcher m;

    public static void main(String[] args) {
        FindText find = new FindText();
        find.run();
    }

    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = "";
            int c = 1;
            // Generate a matcher based on Pattern
            pattern = pattern.compile("<h4>");
            while ((line = reader.readLine()) != null) {
                // Search for text
                m = pattern.matcher(line);

                // Print results
                if(m.find()){
                    System.out.println(" " + c + " " + line);
                }
                c++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
