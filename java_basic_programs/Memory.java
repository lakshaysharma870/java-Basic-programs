public class Memory {
     public static void main(String[] arg){
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.signup(101,"raju");
        e2.signup(101,"rahul");
        e1.display();
        e2.display();
        new Employee().display();//anonymous object
     }
}

class Employee{
    int eid;
    String ename;

    void signup(int id,String name){
        eid=id;
        ename=name;
    }
    void display(){
        System.out.println("id :"+eid);
        System.out.println("name :"+ename);
    }
}