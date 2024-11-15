package lista_ex10.ex4;

public class MainStudent {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Igor");
        s1.setMatricule(2233123);
        s1.setGrades();

        System.out.println(s1.getName());
        System.out.println(s1.getMatricule());
        System.out.println(s1.get_Grades());
        s1.isAprove();
    }
}