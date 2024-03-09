
   
    class Student {
    private String firstname;
    private String lastname;
    private String id;
    private double grade;
    
    
    public Student (String firstname , String lastname , String id)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        grade = 0;
    }
     public void printStudentInfo()
        {
            System.out.println(firstname + " " + lastname+ "\nID: =" + id + "\nGRADE: " +grade);
            
        }
        public void setGrade(int studentGrade){
            grade = studentGrade;
        }
      
}
public class Main {

    public static void main(String[] args) {
        Student std1 = new Student("adnan", "heidari", "40231013");
        Student std2 = new Student("shayan", "shah", "40231029");
        std1.setGrade(18);
        std2.setGrade(19);
        std1.printStudentInfo();
        std2.printStudentInfo();
    }
}
    
