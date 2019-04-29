public class HasPath {

    public void changeId(Student s){
        Student b = new Student(2);
        s = b;
    }
    public static void main(String[] args) {
        Student s = new Student(1);
        HasPath h = new HasPath();
        h.changeId(s);
        System.out.println(s);
    }
}

class Student{
    private int id;
    public Student(int id){
        this.id = id;
    }
    public String toString(){
        return String.valueOf(id);
    }
}