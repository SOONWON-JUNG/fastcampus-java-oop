package com.fastcampus.javaoop.logic;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : com.fastcampus.javaoop.logic
 * fileName : BubbleSort
 * author : gogo1260
 * date : 2022/01/16
 * description :
 * ===========================================================
 * DATE            AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022/01/16     gogo1260         최초 생성
 */
public class BubbleSort<T extends Comparable<T>> implements Sort<T>{

    @Override
    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);

        for (int i = output.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (output.get(j).compareTo(output.get(j + 1)) > 0) {
                    T temp = output.get(j);
                    output.set(j, output.get(j + 1));
                    output.set(j + 1, temp);
                }
            }
        }
        return output;
    }
}
