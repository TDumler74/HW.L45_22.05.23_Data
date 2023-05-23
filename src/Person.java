
//Создайте класс Person, которому при создании передавайте имя и
// дату рождения в виде строки в формате "ДД.ММ.ГГГГ".
//
//Реализуйте в классе интерфейс Comparable<Person>, в котором
// "меньше" будет значить "младше".
//
//Подсказка: не обязательно вычислять возраст, этому мы так и не научились.
//Но можно сравнивать даты рождения!
//
//Альтернативная подсказка: если очень хочется вычислять возраст,
// то можно это делать в миллисекундах с использованием getTime()!

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Comparable<Person> {

  private String name;
  private Date birthday;
  SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

  public Person(String name, String birthday) throws ParseException {
    this.name = name;
    this.birthday = format.parse(birthday);
  }

  public String getName() {
    return name;
  }

  public Date getBirthday() {
    return birthday;
  }

  @Override
  public String toString() {
    return name + " " + format.format(birthday);
  }

  @Override
  public int compareTo(Person o) {
    return -birthday.compareTo(o.birthday);
  }
}
