public class Student {
    private String name;
    private int age;
    private double gpa;

    public String getGpaStatus(){
        if(gpa >= 3){
            return "Excellent!";
        } else if(gpa >= 2){
            return "Good.";
        } else {
            return "Needs Improvement.";
        }
    }

    public void setGpa(double gpa){
        if(gpa >= 0 && gpa <= 4){
            this.gpa = gpa;
        } else {
            this.gpa = 0.0;
            System.out.println("Error: Invalid Input! GPA set to default 0.0");
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
