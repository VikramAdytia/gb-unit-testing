package seminars.online.stubtest;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    void testVerifyMethodCall() {
        // Создаем шпионский объект User
        User user = spy(new User());

        // Вызываем метод setName на шпионе
        user.setName("John");

        // Проверяем, был ли вызван метод setName на шпионе ровно один раз
        verify(user).setName("John");

        // Проверяем, что метод getName не был вызван на шпионе
        verify(user, never()).getName();
    }

    @Test
    void testVerifyMethodCallWithTimes() {
        // Создаем шпионский объект User
        User user = spy(new User());

        // Вызываем метод setName на шпионе дважды
        user.setName("John");
        user.setName("Doe");

        // Проверяем, что метод setName был вызван дважды
        verify(user, times(2)).setName(anyString());
    }

    @Test
    void testVerifyMethodCallAtLeastOnce() {
        // Создаем шпионский объект User
        User user = spy(new User());

        // Вызываем метод setName на шпионе хотя бы один раз
        user.setName("John");

        // Проверяем, что метод setName был вызван хотя бы один раз
        verify(user, atLeastOnce()).setName(anyString());
    }
}