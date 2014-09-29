import java.util.Arrays;
import java.util.List;

public class Person {
  public String name;
  public Person child;

  public Person(String name) {
    this.name = name;
    this.child = null;
  }

  public static void main(String[] args) {
    Person sarah = new Person("Sarah");
    Person bob = new Person("Bob");
    Person greg = new Person("greg");
    List<Person> personList = Arrays.asList(sarah, bob, greg);
    Person flatten = Person.flatten(personList);
  }

  public static Person flatten(List<Person> personList) {
    if (personList == null || personList.size() == 0) return null;
    if (personList.size() == 1) return personList.get(0);

    for (int i =1; i<personList.size(); i++) {
      Person curr = personList.get(i-1);
      Person next = personList.get(i);
      curr.child = next;
    }
    return personList.get(0);
  }
}
