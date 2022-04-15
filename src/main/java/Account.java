import io.qameta.allure.Step;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    @Step("The method of checking the string for compliance with the requirements")
    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
             trim() удаляет пробелы в начале и в конце
             replaceAll("\\s+", " ") убирает лишние пробелы в 1
         */
        if (name.length() >= 3 && name.length() <= 19 && name.trim().replaceAll("\\s+", " ").contains(" ")) {
            return true;
        } else {
            return false;
        }
        }
}