public class copy_cnstrctr{
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "sjjf";
        s1.roll = 54;
        s1.marks[0]= 85;
        s1.marks[1]= 55;
        s1.marks[2]= 100;
        student s2 = new student(s1);//copies the object s1 to new object s2
        s1.marks[1]=99;//(only valid for shallow copy)it will reflect the change in s2 even after copying array elements to s2 previously , 
        //  s2 now just points out to the array created in s1.(shallow copy-> reference is created)
        // (DEEP COPY):-> this change will not reflect while rinting s2.
        // (in memory whole new array is created which consumes some space )
        for(int i=0;i<3;i++){
        System.out.println(s2.marks[i]);
        }
}}
class student{
    String name;
    int roll;
    int marks[];
    // shallow copy constructor
    // student(student s1){//it takes the obect name (student s1)as a parameter for constructor student
        // marks = new int[3];
        // this.name=s1.name;//it copies all the element of s1 to new object s2
        // this.roll=s1.roll;
        // this.marks=s1.marks;//copies the marks stored in s1 to s2
    
    // }
    // deep copy constructor
    student(student s1){//it takes the obect name (student s1)as a parameter for constructor student
        marks = new int[3];
        this.name=s1.name;//it copies all the element of s1 to new object s2
        this.roll=s1.roll;
        for (int i =0 ;i< 3;i++){
            this.marks[i] = s1.marks[i];//now in main class changed value is not shown 
            //  it will show the initial values before copying of the constructors s1 and s2
        } 
    }
    student(){
        marks = new int[3];
        System.out.println("hfhf");
    }
    student(String name){
        marks = new int[3];
        this.name=name;
    }
    student(int roll){
        marks = new int[3];
        this.roll=roll;
    }

}