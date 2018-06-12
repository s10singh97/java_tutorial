class Student{
    int id = 54;
    String name = "Shashwat";
}

class Data{
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("ID "+ s1.id + "\nName " + s1.name);
    }
}