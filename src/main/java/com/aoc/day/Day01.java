package com.aoc.day;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static com.aoc.util.FileUtil.readFileLineToStringArray;
import static java.lang.Math.abs;
import static java.util.Collections.sort;

public class Day01 {

  public Integer findTotalDistance(String filename) throws IOException {
    List<String> inputArray = readFileLineToStringArray(filename);
    List<Integer> left = splitColumn(inputArray, 0, 5);
    List<Integer> right = splitColumn(inputArray, 8, 13);

    sort(left);
    sort(right);

    List<Integer> distances = getDiff(left, right);
    return distances.stream().mapToInt(Integer::intValue).sum();
  }

  private List<Integer> splitColumn(List<String> stringList, Integer start, Integer end) {
    List<Integer> column = new ArrayList<>();
    stringList.forEach(item -> column.add(Integer.valueOf(item.substring(start, end))));
    return column;
  }

  private List<Integer> getDiff(List<Integer> firstColumn, List<Integer> secondColumn) {
    List<Integer> distanceArray = new ArrayList<>();
    List<List<Integer>> combined = IntStream.range(0, Math.min(firstColumn.size(), secondColumn.size()))
        .mapToObj(i-> Arrays.asList(firstColumn.get(i),secondColumn.get(i)))
        .toList();

    combined.forEach(item -> {
      int diff = item.getFirst() - item.getLast();
      distanceArray.add(abs(diff));
    });
    return distanceArray;
  }
}
