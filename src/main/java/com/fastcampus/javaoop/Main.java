package com.fastcampus.javaoop;

import com.fastcampus.javaoop.logic.JavaSort;
import com.fastcampus.javaoop.logic.Sort;

import java.util.Arrays;

/**
 * packageName : com.fastcampus.javaoop
 * fileName : Main
 * author : gogo1260
 * date : 2022/01/16
 * description :
 * ===========================================================
 * DATE            AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022/01/16     gogo1260         최초 생성
 */
public class Main {
    public static void main(String[] args) {
        Sort<String> bubbleSort = new JavaSort<>();

        System.out.println("[result] " + bubbleSort.sort(Arrays.asList(args)));
    }
}
