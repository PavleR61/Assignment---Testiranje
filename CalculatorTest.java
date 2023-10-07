import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {


    @BeforeEach
    public void setUp() {
        // Inicijalizujemo instancu kalkulatora pre svakog testa
    }

    @Test
    public void glavniTest1() {
        //int result = calculator.add(2, 3);
        assertEquals("5.0", Calculator.Run("3+2"), "Zbir nije tačan");
    }

    @Test
    public void glavniTest2() {
        //int result = calculator.subtract(5, 3);
        assertEquals("6.0", Calculator.Run("3*2"), "Zbir nije tačan");
    }
}
