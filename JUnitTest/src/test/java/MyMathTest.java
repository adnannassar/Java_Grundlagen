

import org.example.MyMath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {
    MyMath myMath = new MyMath();

    @Test
    void addTwoToTwoMustEqualsFour() {
        assertEquals(4, myMath.add(2, 2));
    }

    @Test
    void addTwoToSevenMustEqualsNine() {
        assertEquals(9, myMath.add(2, 7));
    }

    @Test
    void getNameShouldBeNull() {
        assertNull(myMath.getName());
    }

    @Test
    void getNameShouldNotBeNull() {
        myMath.setName("Test Name");
        assertNotNull(myMath.getName());
    }


    @Test
    void FirstShouldBeGreater() {
        assertTrue(myMath.isBigger(10, 2));
    }

    @Test
    void FirstShouldBeNotGreater() {
        assertFalse(myMath.isBigger(2, 10));
    }

    @Test
    void SecondShouldBeSmaller() {
        assertTrue(myMath.isBigger(10, 2));
    }

    @Test
    void shouldThrowArithmeticException() {
        assertThrows(ArithmeticException.class, () ->
        {
            myMath.div(10,0);
        });
    }

    @Test
    void TenDivTwoShouldReturnFive(){
        assertEquals(5, myMath.div(10,2));
    }

}