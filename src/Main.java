public class Main {
    public static void main(String[] args) {

        // Create two teachers
        Teacher teacher1 = new Teacher(new Name("zach", "h", "ary"), "1234567890", "123 Main St.", 10, "M.Ed.");
        Teacher teacher2 = new Teacher(new Name("lahai", "h", "caurey"), "0987654321", "456 High St.", 5, "B.Ed.");

        // Create two student batches
        StudentBatch batch1 = new StudentBatch(teacher1,5);
        StudentBatch batch2 = new StudentBatch(teacher2,5);

        // Add the teachers to the student batches
        batch1.setTeacher(teacher1);
        batch2.setTeacher(teacher2);

        // Create three students for each batch
        Student student1 = new Student(new Name("test", "nama", "kau"), "1234567890", "789 Elm St.", "ABC School");
        student1.setMark(0, 85);
        student1.setMark(1, 90);
        student1.setMark(2, 80);
        student1.setMark(3, 95);
        student1.setMark(4, 87);

        Student student2 = new Student(new Name("Hazzratull", "Baia'ah", "Saad"), "0987654321", "321 Oak St.", "XYZ School");
        student2.setMark(0, 75);
        student2.setMark(1, 80);
        student2.setMark(2, 90);
        student2.setMark(3, 85);
        student2.setMark(4, 82);

        Student student3 = new Student(new Name("Ahmad", "Zachary", "Yazid"), "4567890123", "456 Maple St.", "DEF School");
        student3.setMark(0, 95);
        student3.setMark(1, 85);
        student3.setMark(2, 90);
        student3.setMark(3, 92);
        student3.setMark(4, 88);

        Student student4 = new Student(new Name("yoy", "asd", "haihai"), "7890123456", "567 Pine St.", "GHI School");
        student4.setMark(0, 80);
        student4.setMark(1, 90);
        student4.setMark(2, 85);
        student4.setMark(3, 88);
        student4.setMark(4, 92);

        Student student5 = new Student(new Name("ofcourse", "hello", "bye"), "2345678901", "789 Elm St.", "ABC School");
        student5.setMark(0, 90);
        student5.setMark(1, 85);
        student5.setMark(2, 95);
        student5.setMark(3, 80);
        student5.setMark(4, 87);

        Student student6 = new Student(new Name("why", "NOT", "Lido"), "3456789012", "123 Oak St.", "XYZ School");
        student6.setMark(0, 85);
        student6.setMark(1, 95);
        student6.setMark(2, 80);
        student6.setMark(3, 90);
        student6.setMark(4, 82);

        // Add the students to the student batches
        batch1.addStudent(student1);
        batch1.addStudent(student2);
        batch1.addStudent(student3);

        batch2.addStudent(student4);
        batch2.addStudent(student5);
        batch2.addStudent(student6);

        batch1.findStudent("why");

        System.out.println("Average mark: " + student1.getAverageMark());
        System.out.println("Average mark: "+ student4.getAverageMark());

        System.out.println("Highest mark: " + student2.getHighestMark());
        System.out.println("Highest mark: " + student5.getHighestMark());

        System.out.println("Lowest mark: " + student3.getLowestMark());
        System.out.println("Lowest mark: " + student6.getLowestMark());

    }
}