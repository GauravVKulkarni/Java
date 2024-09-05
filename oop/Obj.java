import java.util.Scanner;

class Obj{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    Student s1 = new Student();
    System.out.println("Enter the name.");
    s1.name = sc.nextLine();
    System.out.println("Enter Roll Number.");
    s1.roll = sc.nextInt();

    System.out.println("Name : "+s1.name+"  Roll : "+s1.roll);

    Animal a1 = new Animal();
    a1.name = "Dinosaur";
    a1.category = "Reptile";
    a1.Intro();
    Mammal m1 = new Mammal();
    m1.name = "Tiger";
    m1.category = "Carnivore";
    m1.Intro();
    sc.close();
  }
}

class Student{
  String name;
  int roll;
}

class Animal{
  String name;
  String category;
  void Intro(){
    System.out.println(this.name);
  }
}

class Mammal extends Animal{
  void Intro(){
    System.out.println("Name is "+this.name);
  }
}
