package com.aoc;

import com.aoc.day.Day01;

import java.io.IOException;

public class AocApp {
    public static void main(String[] args) throws IOException {
        System.out.println("""
            ADVENT OF CODE 2024
            *     *     *    *
              *     🦌🛷*     *
            *     *     *    *
            🌲   🏠🌲   🌲   🌲
        🌫️🌫️🌫️🌫️🌫️🌫️🌫️🌫️🌫️
        """);

        Day01 day01 = new Day01();
        Integer day01answer01 = day01.findTotalDistance("day01.txt");
        System.out.println("Day 01: Historian Hysteria");
        System.out.println(day01answer01);
        System.out.println("==============================");
    }
}