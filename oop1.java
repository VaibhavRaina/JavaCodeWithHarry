class employee{
    String name;
    int Salary;

    public int getSalary(){
        
        return Salary;
    }

    public String getName(){
        return name;
    }

     public void setName(String n){
        name=n;
    }

    
}

public class oop1 {
    public static void main(String[] args) {

        employee vaibhav= new employee();
    
        vaibhav.setName("vaibhav");
        System.out.println(vaibhav.getName());
        vaibhav.Salary=120;
        System.out.println(vaibhav.getSalary());
        
    }
    
}
