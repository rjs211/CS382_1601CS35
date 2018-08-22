import java.util.Scanner;


class Student{
    String name;
    String address;
    int age;
    Student(){
        name = new String("unknown");
        address = new String("not Available");
        age = 0;
    }
    
    void setInfo(String n1,int a1){
        name = new String(n1);
        age = a1;
    }
    
    void setInfo(String n1,int a1,String addr){
        name = new String(n1);
        age = a1;
        address = new String(addr);
    }
    
    void display(){
        System.out.printf("Name: %s Age: %d Address: %s.\n",name,age,address);
    }
}


class Assignment_4_1_1601CS35{
    
    public static void main(String args []){
        Student[] stud = new Student[10];
        for(int i = 0;i<10;i++){
            stud[i] = new Student();
        }
        stud[0].setInfo("name0",5);
        stud[1].setInfo("name1",10,"Addr1");
        stud[2].setInfo("name2",15,"Addr2");
        stud[3].setInfo("name3",20);
        stud[4].setInfo("name4",25,"Addr4");
        stud[5].setInfo("name5",30,"Addr5");
        // stud[6].setInfo();
        stud[7].setInfo("name7",40,"Addr7");
        // stud[8].setInfo();
        stud[9].setInfo("name9",50,"Addr9");
        
        for(int i = 0;i<10;i++){
            stud[i].display();
        }
   
    }
    
   

    
    
}