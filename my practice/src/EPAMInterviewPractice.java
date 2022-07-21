import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EPAMInterviewPractice {

    public static void main(String[] args) {
//   Test t = new Test();
//   t.get(null);
    List<Character> list = Arrays.asList('a','a','c','c','d','e','e','e');
        System.out.println(list.stream()
                .collect(Collectors.groupingBy(Function.identity()
                        , Collectors.counting())).entrySet().stream().filter(m->m.getValue()>1).collect(Collectors.toMap(x->x.getKey(),x->x.getValue())));
//        System.out.println(result);
    }
}
class Test{

    public Object get(Object obj){

        return obj;
    }



    public Integer get(Integer obj){

        return obj+1;
    }
}

//class CustomerKey{
//
//    private Address address;
//    private String Id;
//
//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }
//
//    public String getId() {
//        return Id;
//    }
//
//    public void setId(String id) {
//        Id = id;
//    }
//
//    equals(){this.id = val.id}
//    hashcode(){
//        return address.hashcode()+Id.hashCode();
//    }
//}
//    main(){
//        Address addr = new Address("pune");
//        CustomerKey ck = new CustomerKey("d2", addr);
//        Customer cust = new Customer("d2");
//        map.put(ck,cust)
//        ck.setAddress(new Address); //fix issue
//        map.get(ck); // find issue
//    }
