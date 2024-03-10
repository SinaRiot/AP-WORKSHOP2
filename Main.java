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

    public String getFirstname()
    {
        return firstname;
    }
    
    public void setFirstname(String name)
    {
        this.firstname = name;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public double getGrade()
    {
        return grade;
    }

    public void setGrade(double grade)
    {
        this.grade = grade;
    }

     public void printStudentInfo()
        {
            System.out.println(firstname + " " + lastname+ "\nID: =" + id + "\nGRADE: " +grade);
            
        }
        public void setGrade(int studentGrade){
            grade = studentGrade;
        }


}

 class lab {
    private Student[] students;
    private String teacherName;
    private String dayOfWeek;
    private int maxSize;
    private int currentSize;
    private double avgGrade;

    public lab(String teacherName , String dayOfWeek , int maxSize ){
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;
    }
    
    public void calavg()
    {
        for (int i = 0; i < currentSize; i++) {
             double sum = sum  + this.students.grade;
        }
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
    
