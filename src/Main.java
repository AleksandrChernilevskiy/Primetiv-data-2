public class Main {
    public static void main(String[] args) {
        int amountAccount = 1000;
        int receiptsMoney = 1200;
        int finalCheck;
        if (receiptsMoney >= 1000) {
            System.out.println("Вы пополнили счёт на " + receiptsMoney + " рублей 00 коп. На вашем счёте " + (receiptsMoney / 100 + amountAccount + receiptsMoney) + " рублей.");
        } else {
            System.out.println("Вы пополнили счёт на " + receiptsMoney + " рублей 00 коп. На вашем счёте " + (receiptsMoney + amountAccount) + " рублей.");
        }
    }
}