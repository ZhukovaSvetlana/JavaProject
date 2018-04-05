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
            System.out.println(element.getFirstName()+" ");//одинаковые циклы (были использованы геттеры)
            System.out.println(element.getRank()+" ");
        }
    }

    public void add(Employee employee) {    //добавление
        list.add(employee);
    }

    /*public void sortEmployee(Employee employee){//сортировка
        for(int i = list.size()-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( list.get(j).getLastName().compareTo(list.get(j+1).getLastName()) > 0){
                String tmp = list.get(j).getLastName();
                list.get(j).getLastName() = list.get(j+1).getLastName();
                list.get(j+1).getLastName() = tmp;
            }
        }
    }*/

    public void sort() {//сортировка
        List<Integer>list = new ArrayList<>();
        for(int i = list.size()-1 ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j).getLastName().compareTo(list.get(j + 1).getLastName()) > 0) {
                    String tmp = list.get(j).getLastName();
                    list.get(j).getLastName() = list.get(j + 1).getLastName();
                    list.get(j + 1).getLastName() = tmp;
                }
            }
        }
        for(Employee employee: this.list){

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