import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static org.junit.Assert.assertFalse;


@Epic("Checking the output of the input of the first and last name to the bank card")
@Feature("Boundary values and equivalence classes")
public class PraktikumTest {

    @Test(expected = RuntimeException.class)
    @DisplayName("Checking verification")
    @Description("Test with exeption value")
    public void exeptionThrownTest() {
        Account account = new Account(null);

        boolean actual = account.checkNameToEmboss();

        assertFalse(actual);
    }
}
