

// class Bank{
//     float age;
//     String name;
//     String ac = "HDFC"+age+name;
//     Bank(){
//         System.out.println("hello java");
//     }

//     Bank(int a,String n){
//         age=a;
//         name=n;
//     }
//     void p(){
//         System.out.println(age);
//         System.out.println(name);
//     }
// }

// public class Constructor_Practice{
//     public static void main(String...a){
//       Bank o = new Bank();
//       Bank o1 = new Bank(23,"ram");
//       o1.p();    }
//   }


  //=================================== copy constructor========================= //
/*class Student{
    int roll;
    String name;
    Student(){
        roll=101;
        name="lax";

    }
    Student(Student o1){
        roll = o1.roll;
        name = o1.name;
        System.out.println(roll);
        System.out.println(name);;
    }
}
public class Constructor_Practice{
    public static void main(String...a){
      
      Student o1 = new Student();
      Student o2 = new Student(o1);
      
    }
  }*/




   //=================================== add 2 times with copy constructor========================= //



   class Time {
    int h ,m; // object or instance variable
    Time(int h1,int m1){
      h=h1;
      m=m1;
    }

    Time(Time t1,Time t2){
      h=t1.h+t2.h; 
      m=t1.m+t2.m;
      if(m==60){
        h=h+1;
        m=0;
      }
      if(m>60){
        h=h+1;
        m=m%60;
      }
      System.out.println("the final time is :"+h+":"+m);
    }

   }
public class Constructor_Practice{

  public static void main(String...a){
        Time t1 = new Time(2, 30);
        Time t2 = new Time(3 , 40);
        Time t3 = new Time(t1,t2);


      }
}