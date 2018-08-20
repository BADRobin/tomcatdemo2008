package beans;

import java.util.List;

public class MyBean {
    private List<Person> people;

    public MyBean(List<Person> people) {
        this.people = people;
    }
    public MyBean(){

    }
    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }
}
