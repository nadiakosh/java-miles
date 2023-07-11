public class Main {
    public static void main(String args[]) {
        int ticketPrice = 16_720; // стоимость билета

        int miles = ticketPrice / 20; //  количество миль, начисляемые за покупку билета

        System.out.println("Количество миль за покупку билета - " + miles);
    }
}