package com.fastcampus.javaoop.service;

import com.fastcampus.javaoop.logic.BubbleSort;
import com.fastcampus.javaoop.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * packageName : com.fastcampus.javaoop.service
 * fileName : SortServiceTest
 * author : gogo1260
 * date : 2022/01/21
 * description :
 * ===========================================================
 * DATE            AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022/01/21     gogo1260         최초 생성
 */
class SortServiceTest {

    private SortService sut = new SortService(new JavaSort<>());

    @Test
    public void test() {
        //given

        //when
        List<String> actual = sut.doSort(List.of("3", "2", "1"));

        //then
        assertEquals(List.of("1", "2", "3"), actual);
    }

}