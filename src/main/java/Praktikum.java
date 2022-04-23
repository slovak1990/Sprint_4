public class Praktikum {

    public static void main(String[] args) {

        String name = "Тимоти  Шаламе";

        Account account = new Account(name);

        boolean cardName = account.checkNameToEmboss();

        System.out.println(cardName);
        System.out.println(name);
    }

}