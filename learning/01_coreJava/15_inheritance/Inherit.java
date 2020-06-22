public class Inherit 
{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setRollno(100);
        s1.setName("Hamza");
        s1.setAge(21);

        System.out.println("Rollno: " + s1.getRollno());
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}