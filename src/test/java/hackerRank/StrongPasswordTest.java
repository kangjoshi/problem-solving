package hackerRank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StrongPasswordTest {

    private String password;

    @Before
    public void init() {
        password = "Ab1";
    }

    @Test
    public void givenShortPasswordThenReturnCheckMinLengthResult() {
        boolean result = StrongPassword.checkLength(password);
        assertFalse(result);
    }

    @Test
    public void givenLongPasswordThenReturnCheckMinLengthResult() {
        password = "javaee";
        boolean result = StrongPassword.checkLength(password);
        assertTrue(result);
    }

    @Test
    public void givenNotValidPasswordThenReturnCheckNumberResult() {
        password = "abc";
        boolean result = StrongPassword.checkHasNumber(password);
        assertFalse(result);
    }

    @Test
    public void givenValidPasswordThenReturnCheckNumberResult() {
        boolean result = StrongPassword.checkHasNumber(password);
        assertTrue(result);
    }

    @Test
    public void givenNotValidPasswordThenReturnCheckLowerCaseResult() {
        password = "ABC";
        boolean result = StrongPassword.checkHasLowerCase(password);
        assertFalse(result);
    }

    @Test
    public void givenValidPasswordThenReturnCheckLowerCaseResult() {
        boolean result = StrongPassword.checkHasLowerCase(password);
        assertTrue(result);
    }

    @Test
    public void givenNotValidPasswordThenReturnCheckUpperCaseResult() {
        password = "abc";
        boolean result = StrongPassword.checkHasUpperCase(password);
        assertFalse(result);
    }

    @Test
    public void givenValidPasswordThenReturnCheckUpperCaseResult() {
        boolean result = StrongPassword.checkHasUpperCase(password);
        assertTrue(result);
    }

    @Test
    public void givenNotValidPasswordThenReturnCheckSpecialCharResult() {
        password = "password";
        boolean result = StrongPassword.checkHasSpecialChar(password);
        assertFalse(result);
    }

    @Test
    public void givenValidPasswordThenReturnCheckSpecialCharResult() {
        password = "@password";
        boolean result = StrongPassword.checkHasSpecialChar(password);
        assertTrue(result);
    }

    @Test
    public void givenPasswordThenReturnAddNumber() {
        int num = StrongPassword.check(password);
        assertEquals(3, num);
    }

    @Test
    public void givenPasswordThenReturnAddNumber2() {
        password = "#Hackerrank";
        int num = StrongPassword.check(password);
        assertEquals(1, num);
    }

    @Test
    public void givenPasswordThenReturnAddNumber3() {
        password = "#Hackerrank1";
        int num = StrongPassword.check(password);
        assertEquals(0, num);
    }

    @Test
    public void givenPasswordThenReturnAddNumber4() {
        password = "AUzs-nV";
        int num = StrongPassword.check(password);
        assertEquals(1, num);
    }



}