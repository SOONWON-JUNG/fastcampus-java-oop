package com.fastcampus.javaoop.service;

import com.fastcampus.javaoop.logic.Sort;

import java.util.List;

/**
 * packageName : com.fastcampus.javaoop.service
 * fileName : SortService
 * author : gogo1260
 * date : 2022/01/21
 * description :
 * ===========================================================
 * DATE            AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022/01/21     gogo1260         최초 생성
 */
public class SortService {

    private final Sort<String> sort;

    public SortService(Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체: " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list) {

        return sort.sort(list);
    }
}
