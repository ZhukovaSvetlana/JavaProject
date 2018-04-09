import java.util.ArrayList;
import java.util.List;

public class Office {

    private ArrayList<Employee> list = new ArrayList<>();

    /*public boolean isEmployeeInOffice(Employee employee) {
        if (list.contains(employee)){
            return true;
        } else{
            return false;
        }
    }*/
    public boolean isEmployeeInOffice(Employee employee) { //правильный вариант
        return list.contains(employee);
    }

    public void showEmployeelist(){
        /*for (int i=0; i<list.size(); i++){
            //System.out.println(list.get(i).toString());// одинаковые циклы
        }*/
        for (Employee element: this.list){
            System.out.print(element.getLastName()+" ");
            System.out.print(element.getFirstName()+" ");//одинаковые циклы (были использованы геттеры)
            System.out.print(element.getSalary()+" ");
            System.out.println(element.getRank()+" ");
        }
    }

    public void add(Employee employee) {    //добавление
        list.add(employee);
    }


    public void sort() {//сортировка
       // List<Employee>list = new ArrayList<>();

        for(int i = list.size()-1 ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    Employee buf = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, buf);
                }
            }
        }

    }

    public ArrayList<Employee> getList(){
        return list;
    }

    public List<Employee> find(Rank rank){
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee employee: list){
            if (rank == employee.getRank()){
                result.add(employee);
            }
        }
        return result;
    }

}