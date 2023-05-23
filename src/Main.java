import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) throws ParseException {

    List<Person> person = new ArrayList<>();
    person.add(new Person("John", "22.05.1980"));
    person.add(new Person("Marie", "01.10.2002"));
    person.add(new Person("Marie", "01.01.2006"));
    person.add(new Person("Marie", "01.02.2005"));

    System.out.println(person);
    Collections.sort(person);
    System.out.println(person);

//[John 22.05.1980, Marie 01.10.2002, Marie 01.01.2006, Marie 01.02.2005]
//[Marie 01.01.2006, Marie 01.02.2005, Marie 01.10.2002, John 22.05.1980]
  }
}