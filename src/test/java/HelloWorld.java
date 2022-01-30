/* This is just a test file. Tests whether JUnit/Mockito are imported
 * correctly.
 *
 * In other words, this is a test for testing a test :D
 */


import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

// Class for verifying mockito
class Foo {
    public String foo() {
        return "Hello there! This should be mocked";
    }
};

// Class containing tests
public class HelloWorld {

    @Test
    public void shouldJustRunOk() {
        assertEquals(0, 100 - 100);
    }

    @Mock
    Foo foomock = mock(Foo.class);

    @Test
    public void shouldRunMockito() {
        // Setup
        when(foomock.foo()).thenReturn("ok");

        // Run
        String val = foomock.foo();

        // Verify
        assertEquals(val, "ok");
    }
}
