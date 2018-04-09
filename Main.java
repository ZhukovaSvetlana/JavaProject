import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);
    private static Office office = new Office();

    public static void fill(){
        System.out.print("Введите количество сотрудников: ");
        int n = in.nextInt();

        for (int i=0; i < n ; i++){
            System.out.println("Введите фамилию, имя, зарплату и должность сотрудника");
            Employee employee = new Employee(in.next(), in.next(), in.nextInt(), Rank.getRank(in.next()));
            office.add(employee);
        }
    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите команду");
            String command = in.next();

            if (command.equals("fill")) {            // заполнение
                fill();
            }
            if (command.equals("outInfo")) {
                outInfo();
            }
            if (command.equals("sort")) {
                SortEmployee();
            }
            if (command.equals("find")) {
                find();
            }
        }
    }

    public static void SortEmployee(){
        office.sort();
    }

    public static void outInfo(){   // вывод на экран
        office.showEmployeelist();
    }

    public static void find(){
        System.out.println("Введите должность, сотрудников которой хотите найти");
        String rankName = in.next();
        Rank rank = Rank.getRank(rankName);
        if (rank == null){
            System.out.println("Неизвестная должность "+ rankName);
        } else {
            office.find(rank);
            for (Employee employee: office.find(rank)){
                System.out.println(employee);
            }
        }

    }

    /*String a = "Инженер";
    ArrayList<Employee> list = office.getList();
    for(int i = 0; i < list.size(); i++){
        Employee employee = list.get(i);
        Rank rank = employee.getRank();
        if (a.equals(rank.getName())){
            System.out.println(employee.getLastName());
        }
    }*/


        /*Employee ivanovIvan = new Employee( "Иванов", "Иван");
        office.add(ivanovIvan);
        System.out.println(office.isEmployeeInOffice(ivanovIvan));
        Employee petrovPetr = new Employee( "Петров", "Пётр");
        System.out.println(office.isEmployeeInOffice(petrovPetr));
        office.add(petrovPetr);
        office.showEmployeelist();*/






}
