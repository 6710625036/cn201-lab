public class Student {
    private String id;      // e.g. "6710012345"
    private String name;
    private double gpa;
    private int year;

    public Student(String id, String name, double gpa, int year) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.year = year;
    }

    public String getId() { return id; }

    @Override
    public String toString() {
        return "Student{id='" + id + "', name='" + name + "', gpa=" + gpa + ", year=" + year + "}";
    }
}
