import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {

    @org.junit.jupiter.api.Test
    void reverseDoubleCharTest() {
        var method = new Methods();
        assertEquals("oolllleehh", method.reverseDoubleChar("hello"));
    }

    @org.junit.jupiter.api.Test
    void sumDigitsTest() {
        var method = new Methods();
        assertEquals(6, method.sumDigits(123));
    }

    @org.junit.jupiter.api.Test
    void birthdayNameTest() {
        var method = new Methods();
        assertEquals("Happy Birthday Lana!", method.birthdayName("Lana"));
    }

    @org.junit.jupiter.api.Test
    void missingFront() {
        var method = new Methods();
        assertEquals("lo", method.missingFront("hello"));
    }

    @org.junit.jupiter.api.Test
    void swapEnds() {
        var method = new Methods();
        assertEquals("oellh", method.swapEnds("hello"));
    }

    @org.junit.jupiter.api.Test
    void everyOther() {
        var method = new Methods();
        assertEquals("hlo", method.everyOther("hello"));
    }

    @org.junit.jupiter.api.Test
    void nonStart() {
        var method = new Methods();
        assertEquals("elloavid", method.nonStart("hello", "david"));
    }

    @org.junit.jupiter.api.Test
    void fibonacci() {
        var method = new Methods();
        assertEquals(2, method.fibonacci(3));
    }

    @org.junit.jupiter.api.Test
    void luckySum() {
        var method = new Methods();
        assertEquals(6, method.luckySum(2,4,13));
    }

    @org.junit.jupiter.api.Test
    void hasPalindrome() {
        var method = new Methods();
        assertEquals(true, method.hasPalindrome("racecar"));
    }

    @org.junit.jupiter.api.Test
    void powerOfTwo() {var method = new Methods();
        assertEquals(true, method.powerOfTwo(16));
    }
}