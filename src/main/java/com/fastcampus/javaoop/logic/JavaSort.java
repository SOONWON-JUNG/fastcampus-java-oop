package com.fastcampus.javaoop.logic;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * packageName : com.fastcampus.javaoop.logic
 * fileName : JavaSort
 * author : gogo1260
 * date : 2022/01/16
 * description :
 * ===========================================================
 * DATE            AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022/01/16     gogo1260         최초 생성
 */
public class JavaSort<T extends Comparable<T>> {
    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);
        Collections.sort(output);

        return output;
    }




}
