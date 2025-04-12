public class This_Key {
    public static void main(String[] args) {
        T t= new T();
        t.f(101, "anil");
        T t2= new T();
        t2.f(102, "ram");
        t.display();
        t2.display();


    }
}

class T {
    int eid ;
    String ename;
    String cname="tcs";

    void f(int eid , String ename ){
        this.eid=eid;
        this.ename=ename;
    }

    

    void display(){
        System.out.println("id="+this.eid);
        System.out.println("name="+this.ename);
        System.out.println("company="+this.cname);
    }
}
