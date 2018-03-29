import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);
    private static Office office = new Office();

    public static void fill(){
        System.out.print("Введите количество сотрудников: ");
        int n = in.nextInt();

        for (int i=0; i < n ; i++){
            Employee employee = new Employee(in.next(), in.next(), in.nextInt(), Rank.valueOf(in.next()));
            office.add(employee);
        }
    }
    public static void main(String[] args) {
        System.out.println("Введите команду");
        String command = in.next();
        if (command.equals("fill")){            // заполнение
            fill();
        }
        if (command.equals("outInfo")){
            outInfo();
        }
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



        /*while (true){
            System.out.println("Введите номер операции");
            System.out.println("1: заполнить контейнер данными с клавиатуры");
            System.out.println("2: вывод информации о сотрудниках на экран");
            System.out.println("3: поиск сотрудников, состоящих на заданной должности");
            System.out.println("4: сортировка по фамилии и по зарплате");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            switch (x){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
            }
        }*/


}
