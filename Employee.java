public class Employee {
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

}
