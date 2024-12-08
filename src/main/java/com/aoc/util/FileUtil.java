package com.aoc.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
  public static List<String> readFileLineToStringArray(String filename) throws IOException {
    File file = new File("src/main/resources/input/" + filename);
    BufferedReader br = new BufferedReader(new FileReader(file));
    List<String> input = new ArrayList<>();

    String line;
    while((line = br.readLine()) != null) {
      input.add(line);
    }

    br.close();
    return input;
  }
}
