public class Main {

    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1985",  "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());
        System.out.println("_ _ _ _ _");

        Employee jessica = new Employee("Jessica", "09/25/1985",  "01/01/2020");
        System.out.println(jessica);
        System.out.println("Age = " + jessica.getAge());
        System.out.println("Pay = " + jessica.collectPay());
    }
}
