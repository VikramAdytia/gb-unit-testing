package seminars.online.stubtest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentProcessorTest {

    @Test
    void testProcessPayment() {
        // Создаем заглушку для платежной системы
        PaymentGateway paymentGateway = new PaymentGatewayStub();

        // Создаем экземпляр PaymentProcessor, передавая заглушку
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);

        // Вызываем метод processPayment с фиксированной суммой
        boolean result = paymentProcessor.processPayment(50.0);

        // Проверяем, что результат соответствует ожиданию (сумма положительная)
        assertTrue(result);
    }
}

