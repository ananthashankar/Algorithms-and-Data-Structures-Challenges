package com.challenges.solutions;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Anantha on 12/15/17.
 */
public class Replace_Class_Names {

    public static void main(String args[]) throws Exception {
        File folder = new File("/Users/Anantha/Desktop/GitHub-Repository/Algorithms-and-Data-Structures-Challenges");
        File[] files = folder.listFiles();
        Charset charset = StandardCharsets.UTF_8;
        Arrays.sort(files);

        for(File f : files){
            System.out.println("fileName: " + f.getName());
            if(f.getName().split("\\.")[1].equals("java")) {
                Path path = Paths.get(f.getPath());
                String content = new String(Files.readAllBytes(path), charset);
                content = content.replaceAll("class Solution", "class " + f.getName().split("\\.")[0]);
                Files.write(path, content.getBytes(charset));
            }
        }
    }
}
