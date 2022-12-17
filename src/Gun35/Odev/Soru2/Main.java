package Gun35.Odev.Soru2;

public class Main {
    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.setName("Fernando");
        employees.setSalary(8000);
        employees.setBirthDay("11.23.2000");
        System.out.println("Name is " + employees.getName());
        System.out.println("Salary is " + employees.getSalary());
        System.out.println("Date of birth " + employees.getBirthDay());
        ageCalculator();




    }
    public static int ageCalculator () {
        int Fernando = 0;
        int date = 2022;
        int birthDay = 2000;

        if (Fernando < 18) {
            System.out.println(" **Welcome to our company Fernando your salary is 80000.** ");
        }
        else if (Fernando > 18) {
                System.out.println(" **come back when you are 18 years old.** ");
            }
        else if (Fernando == 18)
                System.out.println("  **we can have inter with you after that you can have a 80000 salary** ");

            System.out.println("employee age " + (date - birthDay));

            return Fernando;

        }
    }


