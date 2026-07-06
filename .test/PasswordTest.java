import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class PasswordTest {

    @ParameterizedTest
    @ValueSource(chars = {'0','1','2','3','4','5','6','7','8','9'})
    void Valid_Digit(char c) {
        assertEquals(true, PasswordCheck.isDigit(c));
    }

    @ParameterizedTest
    @ValueSource(chars = {'a','A','!',' '})
    void Invalid_Digit(char c) {
        assertEquals(false, PasswordCheck.isDigit(c));
    }

    @ParameterizedTest
    @ValueSource(chars = {
            'A','B','C','D','E','F','G','H','I','J',
            'K','L','M','N','O','P','Q','R','S','T',
            'U','V','W','X','Y','Z'
    })
    void Valid_Upper_Case(char c) {
        assertEquals(true, PasswordCheck.isUpperCase(c));
    }

    @ParameterizedTest
    @ValueSource(chars = {'a','z','1','!'})
    void Invalid_Upper_Case(char c) {
        assertEquals(false, PasswordCheck.isUpperCase(c));
    }

    @ParameterizedTest
    @ValueSource(chars = {
            'a','b','c','d','e','f','g','h','i','j',
            'k','l','m','n','o','p','q','r','s','t',
            'u','v','w','x','y','z'
    })
    void Valid_Lower_Case(char c) {
        assertEquals(true, PasswordCheck.isLowerCase(c));
    }

    @ParameterizedTest
    @ValueSource(chars = {'A','Z','1','!'})
    void Invalid_Lower_Case(char c) {
        assertEquals(false, PasswordCheck.isLowerCase(c));
    }

    @ParameterizedTest
    @CsvSource({
            // Too short
            "As!2, false",
            "A!2, false",
            "a!2, false",
            "As!, false",
            "As1, false",

            // Missing required components
            "ASDF1234!#$&, false",   // no lowercase
            "qwer1234!#$&, false",   // no uppercase
            "ASDFqwer!#$&, false",   // no digit
            "ASDFqwer1234, false",   // no symbol

            // Invalid characters
            "ASDFqwer1234!#$&@, false",

            // Too long
            "As!2asdfasdfasdfasdfasdfasdfasdfa, false",

            // Clearly invalid
            "@, false",
            "@@@@@@@@, false",

            // Valid
            "ASDFqwer1234!!!!, true"
    })
    void Password_Validation(String password, boolean expected) {
        assertEquals(expected, PasswordCheck.isValidPassword(password));
    }
}
