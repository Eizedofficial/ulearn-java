public class School {
    private ArrayList<Human> humans = new ArrayList<>();
    public void add(Human human)
    {
        humans.add(human);
    }
    public String getPeoplesInSchool() {

        StringBuilder text = new StringBuilder();
        text.append("В школе:\n");
        humans.stream().filter(Human::isInSchool).forEach(human -> text.append(human.toString()).append("\n"));
        return text.toString();
        /* реализуйте метод получения учителей и учеников в школе
           в формате:

           В школе:
           Игорь Николаев Математика 20
           Иван Иванов 2010
         */
    }
}


public class Human {

    private final String name;
    private final String surname;
    private boolean inSchool;

    public boolean isInSchool() {
        return inSchool;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void goInSchool() {
        this.inSchool = true;

    }

    public void outFromSchool() {
        this.inSchool = false;

    }

    public String toString() {
        return getName() + " " + getSurname();
    }
}


public class Pupil extends Human {


    private final int year;

    public int getYear() {
        return year;
    }

    public Pupil(String name, String surname, int year) {
        super(name, surname);
        this.year = year;

    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " " + getYear();
    }
}

public class Teacher extends Human {


    private final String subject;
    private final int workTime;

    public String getSubject() {
        return subject;
    }

    public int getWorkTime() {
        return workTime;
    }

    public Teacher(String name, String surname, String subject, int work_exp) {
        super(name, surname);
        this.subject = subject;
        this.workTime = work_exp;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " " + getSubject() + " " + getWorkTime();
    }
}
