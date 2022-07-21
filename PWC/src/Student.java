public class Student implements  Comparable{
    private int id;

    @Override
    public int compareTo(Object o) {
        Student s= (Student) o;

        return this.id == s.id?0:(this.id>s.id)?1:-1;
    }
}
Collections.sort(list);

List<Student> sortedList = list.stream().sorted().collect(Collectors.toList());


//