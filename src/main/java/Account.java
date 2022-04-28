import io.qameta.allure.Step;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    @Step("The method of checking the string for compliance with the requirements")
    public boolean checkNameToEmboss() {
        if (name == null) {
            return false;
        } else return name.length() >= 3 && name.length() <= 19 && name.trim().matches("(\\S+)\\s(\\S+)");
    }
}