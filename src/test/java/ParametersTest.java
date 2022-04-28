import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@Epic("Checking the output of the input of the first and last name to the bank card")
@Feature("Boundary values and equivalence classes")
@RunWith(Parameterized.class)
public class ParametersTest {

    private final String value;
    private final boolean expectedResponse;

    public ParametersTest(String value, boolean expectedResponse) {
        this.value = value;
        this.expectedResponse = expectedResponse;
    }

    @Parameterized.Parameters(name = "Тестовые данные: входная строка {0}, валидно: {1}")
    public static Object[] maneParameters() {
        return new Object[][]{
                {"Тимоти Шаламе", true},
                {"ТИМОТИ ШАЛАМЕ", true},
                {" Тимоти Шаламе ", true},
                {"Тимоти    Шаламе", false},
                {"Тимоти  Шаламе", false},
                {"Та и", true},
                {"Грандмастер Адмирал", true},
                {"Гранмастер Адмирал", true},
                {"Ти", false},
                {"Грандмастер Адмиралъ", false},
                {"", false},
                {"Тимотейка Шаламойшниковайте", false},
                {"Тимоти-Шаламе", false},
                {"1234567891123456789", false},
                {"           ", false},
                {null, false},
        };
    }

    @Test
    @DisplayName("Checking verification")
    @Description("Parameterized test with values")
    public void withParametersTest() {
        Account account = new Account(value);

        boolean actual = account.checkNameToEmboss();

        assertEquals(expectedResponse, actual);
    }
}
