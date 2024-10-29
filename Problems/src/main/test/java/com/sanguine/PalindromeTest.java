package com.sanguine;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @org.junit.jupiter.api.Test
    void isPalindrome() {
       assertTrue(Palindrome.isPalindrome(12321));
    }

    @org.junit.jupiter.api.Test
    void isNotPalindrome() {
        assertFalse(Palindrome.isPalindrome(1231));
    }
}