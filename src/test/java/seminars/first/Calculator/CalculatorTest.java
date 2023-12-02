package seminars.first.Calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Проверка равенства значений")
    void testAssertEquals() {
        assertEquals(4,  Calculator.calculation(2, 2, '+'));
    }

    @Test
    @DisplayName("Проверка неравенства значений")
    void testAssertNotEquals() {
        assertNotEquals(5,  Calculator.calculation(2, 2, '+' ));
    }

    @Test
    @DisplayName("Проверка истинного условия")
    void testAssertTrue() {
        assertTrue( Calculator.calculation(2, 2 ,'+') == 4);
    }

    @Test
    @DisplayName("Проверка ложного условия")
    void testAssertFalse() {
        assertFalse( Calculator.calculation(2, 2, '+') == 5);
    }

    @Test
    @DisplayName("Проверка наличия объекта")
    void testAssertNotNull() {
        assertNotNull(calculator);
    }

    @Test
    @DisplayName("Проверка отсутствия объекта")
    void testAssertNull() {
        calculator = null;
        assertNull(calculator);
    }

    @Test
    @DisplayName("Проверка равенства массивов")
    void testAssertArrayEquals() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Проверка на генерацию исключений")
    void testAssertThrows() {
        assertThrows(IllegalArgumentException.class, () ->  Calculator.calculation(1, 0, '/'));
    }

    // Дополнительные ассерты
    @Test
    @DisplayName("Проверка с сообщением")
    void testAssertWithMessage() {
        assertEquals(4,  Calculator.calculation(2, 2, '+'), "2 + 2 должно быть равно 4");
    }

    @Test
    @DisplayName("Проверка с использованием лямбда-выражения для сообщения")
    void testAssertWithLambdaMessage() {
        assertEquals(4,  Calculator.calculation(2, 2, '+'), () -> "2 + 2 должно быть равно 4");
    }
//HomeWork 01

    @Test
    @DisplayName("Check discount subcalcs")
    void testCalculateDiscount() {
        assertEquals(80.00, calculator.calculatingDiscount(100.00, 0.20));
    }

    @Test
    @DisplayName("Check discount exceptions throws")
    void testCalculateDiscount2(){
        assertThrows(ArithmeticException.class, () -> calculator.calculatingDiscount(0,2));
    }
//    public static void main(String[] args) {
//        // Проверка базового функционала с целыми числами:
//        if (8 != Calculator.calculation(2, 6, '+')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        if (0 != Calculator.calculation(2, 2, '-')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        if (14 != Calculator.calculation(2, 7, '*')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        if (2 != Calculator.calculation(100, 50, '/')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        // Случаи с неправильными аргументами
//        // аргумент operator типа char, должен вызывать исключение, если он получает не базовые символы (+-*/)
//        // try {
//        //     seminars.first.Calculator.Calculator.calculation(8, 4, '_');
//        // } catch (IllegalStateException e) {
//        //     if (!e.getMessage().equals("Unexpected value operator: _")) {
//        //         throw new AssertionError("Ошибка в методе");
//        //     }
//        // }
//
//        // Проверка базового функционала с целыми числами, с использованием утверждений:
//        assert 8 == Calculator.calculation(2, 6, '+');
//        assert 0 == Calculator.calculation(2, 2, '-');
//        assert 14 == Calculator.calculation(2, 7, '*');
//        assert 2 == Calculator.calculation(100, 50, '/');
//
//        // Проверка базового функционала с целыми числами, с использованием утверждений AssertJ:
////        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
////        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
////        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
////        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);
//
//        // Проверка ожидаемого исключения, с использованием утверждений AssertJ:
////        assertThatThrownBy(() ->
////                Calculator.calculation(8, 4, '_')
////        ).isInstanceOf(IllegalStateException.class);
//
//        System.out.println(Calculator.calculation(2_147_483_647, 1, '+')); // integer overflow
//        System.out.println(Calculator.squareRootExtraction(169));
//
//        // Примерные решения домашних заданий из 1 лекции:
//
//        // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
//        // необходимые проверки для него используя граничные случаи
//        // assertThatThrownBy(() ->
//        //         seminars.first.Calculator.Calculator.squareRootExtraction(0, 1, -1)
//        // ).isInstanceOf(SomeStateException.class);
//
//        // HW1.2: Как будет выглядеть проверка для случая деления на ноль? (с использованием AssertJ)
//        // assertThatThrownBy(() ->
//        //        seminars.first.Calculator.Calculator.calculation(5, 0, '/')
//        // ).isInstanceOf(ArithmeticException.class);
//
//        // HW1.3: Сравните одну и ту же проверку с использованием условий, ассертов, AssertJ
//        // в каком случае стандартное сообщение об ошибке будет более информативным?
//        // if (0 != seminars.first.Calculator.Calculator.calculation(2, 6, '+')) {
//        //     throw new AssertionError("Ошибка в методе");
//        // }
//        //   assert 0 == seminars.first.Calculator.Calculator.calculation(2, 6, '+');
//        //    assertThat(seminars.first.Calculator.Calculator.calculation(2, 6, '+')).isEqualTo(0);
//    }
}