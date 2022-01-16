package com.fastcampus.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName : com.fastcampus.javaoop
 * fileName : MainTest
 * author : gogo1260
 * date : 2022/01/16
 * description :
 * ===========================================================
 * DATE            AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022/01/16     gogo1260         최초 생성
 */
class MainTest {

    @Test
    public void main() {
        //given
        String[] args = {"3", "1", "2"};

        //when & then
        Main.main(args);

    }
}