public class Main {

    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1985",  "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());
        System.out.println("_ _ _ _ _");

        SalariedEmployee jessica = new SalariedEmployee("Jessica", "09/25/1985",  "01/01/2020", 35000);
        System.out.println(jessica);
        System.out.println("Age = " + jessica.getAge());
        System.out.println("Jessica's paycheck = $" + jessica.collectPay());

        jessica.retire();
        System.out.println("Jessica's Pension check = $ " + jessica.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021", 15); {
            System.out.println(mary);
            System.out.println("Mary's paycheck = $" + mary.collectPay());
            System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
        }
    }
}
