import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public class ProblemSolving {

//    public static void  main(String[] gg){
//
////        String a="Ashwini";
//        String a="Asmat";
//        char[] arr=a.toLowerCase(Locale.ROOT).toCharArray();
//        HashMap<Character,Integer> map=new HashMap<>();
//
//        for(Character b:arr){
//            if(map.containsKey(b)){
//                map.put(b,map.get(b) +1);
//            }else{
//                map.put(b,1);
//            }
//        }
//        System.out.println(map);
//        for(Map.Entry<Character,Integer> ent:map.entrySet()){
//            if(ent.getValue() == 1){
//                System.out.println(ent);
//                break;
//            }
//        }
//
//    }
  public static void  main(String[] gg){
    Person person1 = new Person(1,"Ashwini");
        Person person2 = new Person(2,"Akshat");
        Person person3 = new Person(1,"Ashwini");
        Person person4 = person1;
        Map<Person,String> myMap= new HashMap<>();
        myMap.put(person1,"person1");
      myMap.put(person2,"person2");
      myMap.put(person3,"person3");
      myMap.put(person4,"person4");
      System.out.println(myMap.size());
    }
}
class Person{
    int id;
    String name;

    public Person(int i,String name){
        this.id = i;
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}



