package com.fastcampus.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * packageName : com.fastcampus.javaoop.logic
 * fileName : JavaSortTest
 * author : gogo1260
 * date : 2022/01/16
 * description :
 * ===========================================================
 * DATE            AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022/01/16     gogo1260         최초 생성
 */
class JavaSortTest {

    @DisplayName("자바소트 - 리스트를 넣으면 정렬된 결과를 보여준다")
    @Test
    public void given_List_WhenExecuting_ThenReturnSortedList() {
        //given
        JavaSort<Integer> javaSort = new JavaSort<>();

        //when
        List<Integer> actual = javaSort.sort(List.of(3, 2, 4, 5, 1));


        //then
        assertEquals(List.of(1, 2, 3, 4, 5), actual);

    }


}