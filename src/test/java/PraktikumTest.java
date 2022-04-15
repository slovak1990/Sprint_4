import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@Epic("Checking the output of the input of the first and last name to the bank card")
@Feature("Boundary values and equivalence classes")
public class PraktikumTest {

    private final String name1 = "Тимоти Шаламе";
    private final String name2 = "ТИМОТИ ШАЛАМЕ";
    private final String name3 = " Тимоти Шаламе ";
    private final String name4 = "Тимоти    Шаламе";
    private final String name5 = "Та и";
    private final String name6 = "Грандмастер Адмирал";
    private final String name7 = "Гранмастер Адмирал";
    private final String name8 = "Ти";
    private final String name9 = "Грандмастер Адмиралъ";
    private final String name10 = "";
    private final String name11 = "Тимотейка Шаламойшниковайте";
    private final String name12 = "Тимоти-Шаламе";
    private final String name13 = "1234567891123456789";
    private final String name14 = "           ";

    @DisplayName("Pozitive test with correct values")
    @Description("Positive verification with correct first and last name values in Cyrillic with a space")
    @Test
    public void nameAccountTest1() {
        Account account = new Account(name1);

        boolean cardName = account.checkNameToEmboss();

        assertTrue(cardName);
    }

    @DisplayName("Pozitive test with correct values")
    @Description("Positive verification with the correct values of the first and last names in Cyrillic in large letters with a space")
    @Test
    public void nameAccountTest2() {
        Account account = new Account(name2);

        boolean cardName = account.checkNameToEmboss();

        assertTrue(cardName);
    }

    @DisplayName("Pozitive test with correct values")
    @Description("Positive verification with correct first and last name values in Cyrillic with a space in the middle and spaces at the end and beginning")
    @Test
    public void nameAccountTest3() {
        Account account = new Account(name3);

        boolean cardName = account.checkNameToEmboss();

        assertTrue(cardName);
    }

    @DisplayName("Pozitive test with correct values")
    @Description("Positive verification with correct first and last name values in Cyrillic with 3 spaces in the middle")
    @Test
    public void nameAccountTest4() {
        Account account = new Account(name4);

        boolean cardName = account.checkNameToEmboss();

        assertTrue(cardName);
    }

    @DisplayName("Pozitive test with correct values")
    @Description("Positive verification with the correct values of the first and last name 3 characters long and with a space")
    @Test
    public void nameAccountTest5() {
        Account account = new Account(name5);

        boolean cardName = account.checkNameToEmboss();

        assertTrue(cardName);
    }

    @DisplayName("Pozitive test with correct values")
    @Description("Positive verification with the correct values of the first and last name 19 characters long and with a space")
    @Test
    public void nameAccountTest6() {
        Account account = new Account(name6);

        boolean cardName = account.checkNameToEmboss();

        assertTrue(cardName);
    }

    @DisplayName("Pozitive test with correct values")
    @Description("Positive verification with the correct values of the first and last name 18 characters long and with a space")
    @Test
    public void nameAccountTest7() {
        Account account = new Account(name7);

        boolean cardName = account.checkNameToEmboss();

        assertTrue(cardName);
    }

    @DisplayName("Negative test with incorrect values")
    @Description("Negative verification with the correct values of the first and last name 2 characters long and with a space")
    @Test
    public void nameAccountTest8() {
        Account account = new Account(name8);

        boolean cardName = account.checkNameToEmboss();

        assertFalse(cardName);
    }

    @DisplayName("Negative test with incorrect values")
    @Description("Negative verification with the correct values of the first and last name 20 characters long and with a space")
    @Test
    public void nameAccountTest9() {
        Account account = new Account(name9);

        boolean cardName = account.checkNameToEmboss();

        assertFalse(cardName);
    }

    @DisplayName("Negative test with incorrect values")
    @Description("Negative verification with an empty field")
    @Test
    public void nameAccountTest10() {
        Account account = new Account(name10);

        boolean cardName = account.checkNameToEmboss();

        assertFalse(cardName);
    }

    @DisplayName("Negative test with incorrect values")
    @Description("Negative verification with the correct values of the first and last name 27 characters long and with a space")
    @Test
    public void nameAccountTest11() {
        Account account = new Account(name11);

        boolean cardName = account.checkNameToEmboss();

        assertFalse(cardName);
    }

    @DisplayName("Negative test with incorrect values")
    @Description("Negative verification with a dash instead of a space")
    @Test
    public void nameAccountTest12() {
        Account account = new Account(name12);

        boolean cardName = account.checkNameToEmboss();

        assertFalse(cardName);
    }

    @DisplayName("Negative test with incorrect values")
    @Description("Negative verification with numbers without a space")
    @Test
    public void nameAccountTest13() {
        Account account = new Account(name13);

        boolean cardName = account.checkNameToEmboss();

        assertFalse(cardName);
    }

    @DisplayName("Negative test with incorrect values")
    @Description("Negative verification with spaces only")
    @Test
    public void nameAccountTest14() {
        Account account = new Account(name14);

        boolean cardName = account.checkNameToEmboss();

        assertFalse(cardName);
    }
}
