public class Employee extends Object implements Comparable{
    private String lastName;
    private String firstName;
    private Rank rank;
    private int salary;

    public Employee(String lastName, String firstName, int salary, Rank rank) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
        this.rank = rank;
    }

    public int getSalary() {
        return salary;
    }

    public Rank getRank(){

        return rank;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void fill(String s1, String s2, int salary, Rank rank){
        this.lastName = s1;
        this.firstName = s2;
        this.salary = salary;
        this.rank = rank;
    }

    public String toString(){
        return lastName + " " + firstName + " " +salary + " " + rank;
    }


    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee){
            Employee second = (Employee)o;
            if (this.lastName.compareTo(second.getLastName()) == 0){
                return this.salary - second.getSalary();
            }
            else{
                return this.lastName.compareTo(second.getLastName());
            }
        }
        return 1;
    }
}