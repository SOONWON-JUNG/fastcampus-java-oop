package com.fastcampus.javaoop.logic;

import java.util.List;

/**
 * packageName : com.fastcampus.javaoop.logic
 * fileName : Sort
 * author : gogo1260
 * date : 2022/01/21
 * description :
 * ===========================================================
 * DATE            AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022/01/21     gogo1260         최초 생성
 */
public interface Sort<T extends Comparable<T>> {
    List<T> sort(List<T> list);
}
