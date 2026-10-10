public class StudentRegistry {
    private Student[] roster = new Student[100];
    private int count = 0;

    public void add(Student s) {
        if (count < roster.length) {
            roster[count] = s;
            count++;
        } else {
            System.out.println("Error: Roster is full!");
        }
    }

    public void listAll() {
        for (int i = 0; i < roster.length; i++) {
            if (roster[i] != null) {
                System.out.println(roster[i]);
            }
        }
    }

    public Student findById(String id) {
        for (int i = 0; i < roster.length; i++) {
            if (roster[i] != null && roster[i].getId().equals(id)) {
                return roster[i];
            }
        }
        return null;   // not found
    }
}
