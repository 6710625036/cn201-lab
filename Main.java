public class Main {
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        
        // TODO 1: add at least four students
        registry.add(new Student("6710012345", "Nara", 3.42, 2));
        registry.add(new Student("6710012346", "Somchai", 3.80, 1));
        registry.add(new Student("6710012347", "Somsri", 2.95, 3));
        registry.add(new Student("6710012348", "Kitti", 3.10, 4));
        
        // TODO 2: list them all
        System.out.println("--- All Students ---");
        registry.listAll();
        
        // TODO 3: find an id that exists
        System.out.println("\n--- Finding Existing Student (6710012345) ---");
        Student s = registry.findById("6710012345");
        if (s != null) {
            System.out.println("Found: " + s);
        } else {
            System.out.println("No student with id 6710012345");
        }
        
        // TODO 4: find an id that does NOT exist
        System.out.println("\n--- Finding Non-Existing Student (9999999999) ---");
        Student missing = registry.findById("9999999999");
        if (missing != null) {
            System.out.println("Found: " + missing);
        } else {
            System.out.println("No student with id 9999999999 (handled safely!)");
        }
    }
}
