public class Main {
    public static void main(String[] args) {
        int num = 10;

        // Rẽ nhánh
        if (num > 0) {
            System.out.println("Số dương");
        } else if (num < 0) {
            System.out.println("Số âm");
        } else {
            System.out.println("Số không");
        }

        // Vòng lặp
        for (int i = 0; i < num; i++) {
            System.out.println("Số: " + i);
        }
    }
}
