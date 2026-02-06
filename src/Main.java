public class Main {
    public static void main (String[] args) {

        Resturant mcDonalds = new Resturant(30, 3.5, 12.5, 5.1, "06:00-22:00");
        Resturant chipotle = new Resturant(15, 4.7, 15, 7, "11:00-20:00");

        //sout = System.out.println
        System.out.println("Hours Open: " + mcDonalds.rating);
        System.out.println("Wait Time: " + chipotle.avgPrice);
    }
}