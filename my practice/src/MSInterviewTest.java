import java.util.*;

public class MSInterviewTest {

    public static void main(String[] gg){
        HashMap<Employee,Integer> maps=new HashMap<>();
        List<Address> addresses = new ArrayList<>();
       Address a1= new Address("Pune");
        Address a2= new Address("Mumbai");
        addresses.add(a1);
        addresses.add(a2);
        Employee e1=new Employee(1,"Morgan");
//        Employee e2=new Employee(1,"Morgan");
//        maps.put(e1,100);
//        maps.put(e2,200);
//        maps.get(new Employee(1,"Morgan"));
//        for (Address address : e1.getAddresses()) {
//            System.out.println(address.getCity());
//        }
//        a1.setCity("Kolkata");
//        for (Address address : e1.getAddresses()) {
//            System.out.println(address.getCity());
//        }
        List<Employee> emps= new ArrayList<>();
        emps.add(e1);
        emps.add(new Employee(2,"Morgan"));

        HashSet<Employee> empSet = new HashSet<>();
        for(Employee e:emps) empSet.add(e);


        empSet.forEach(e-> System.out.println(e.getName()));



    }
}
class Employee{
 private final int id;
 private final String name;
// private  final List<Address> addresses;


    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
//
//        ArrayList<Address> addresses1 = new ArrayList<>();
//
//        this.addresses = addresses;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

//    public List<Address> getAddresses() {
//        return addresses;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
class Address{
    private  String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
