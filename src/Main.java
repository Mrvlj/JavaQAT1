
public class Main {
    public static void main(String[] args) {
        int amount = 90;
        boolean isRegistered = true;

        int percent;
        if (isRegistered) {
            percent = 3;
        } else {
            percent = 1;
        }
        //int percent = isRegistered ? 3 : 1;
        int bonus = amount * percent / 100;

        if (bonus > 500) {
            bonus = 500;
        }
        System.out.println("Ваш бонус: " + bonus);
    }
}
