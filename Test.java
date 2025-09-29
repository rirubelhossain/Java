public class Test{
    String fname ;
    String lname ;
    int age ;

    public void getData(String a , String b , int age )
    {
        this.fname = a ;
        this.lname = b ;
        this.age = age ;

    }
    public void DisplayData()
    {
        System.out.println("Name is " + this.fname + " " + this.lname + " and age " + this.age);
    }

    public static void main(String[] args)
    {   
        Test man = new Test() ;
        man.getData("Rubel","Hossain", 30);
        man.DisplayData();
        //System.out.println("Name is " + man.fname + " " + man.lname + " and " + man.age);
        System.out.println("Hello Java");
    }
}