import java.util.*;

abstract class Student {
  String name;
  int reg_no;
  float cgpa;
  String branch;

  public Student(String name, int reg_no, String branch) {
    this.name = name;
    this.reg_no = reg_no;
    this.branch = branch;
  }

  public abstract void calculateCGPA();

  public void print_details() {
    System.out.println("\nSTUDENT DETAILS ARE:-");
    System.out.println("Name: " + this.name);
    System.out.println("Reg No: " + this.reg_no);
    System.out.println("Branch: " + this.branch);
    System.out.printf("CGPA: %.2f\n", this.cgpa);
  }
}

class Subject {
  int mark;
  int credits;

  public Subject(int mark, int credits) {
    this.mark = mark;
    this.credits = credits;
  }
}

class CSEStudent extends Student {
  Subject[] subjects;

  public CSEStudent(String name, int reg_no, Subject[] subjects) {
    super(name, reg_no, "CSE");
    this.subjects = subjects;
    calculateCGPA();
  }

  @Override
  public void calculateCGPA() {
    int totalmarks = 0;
    int totalcredits = 0;
    for (Subject s : subjects) {
      totalmarks += s.mark * s.credits;
      totalcredits += s.credits;
    }
    this.cgpa = (float) totalmarks / totalcredits / 10;
  }
}

class MECHStudent extends Student {
  Subject[] subjects;

  public MECHStudent(String name, int reg_no, Subject[] subjects) {
    super(name, reg_no, "MECH");
    this.subjects = subjects;
    calculateCGPA();
  }

  @Override
  public void calculateCGPA() {
    int totalmarks = 0;
    int totalcredits = 0;
    for (Subject s : subjects) {
      totalmarks += s.mark * s.credits;
      totalcredits += s.credits;
    }
    this.cgpa = (float) totalmarks / totalcredits / 10;
  }
}

class CIVILStudent extends Student {
  Subject[] subjects;

  public CIVILStudent(String name, int reg_no, Subject[] subjects) {
    super(name, reg_no, "CIVIL");
    this.subjects = subjects;
    calculateCGPA();
  }

  @Override
  public void calculateCGPA() {
    int totalmarks = 0;
    int totalcredits = 0;
    for (Subject s : subjects) {
      totalmarks += s.mark * s.credits;
      totalcredits += s.credits;
    }
    this.cgpa = (float) totalmarks / totalcredits / 10;
  }
}

class ECEStudent extends Student {
  Subject[] subjects;

  public ECEStudent(String name, int reg_no, Subject[] subjects) {
    super(name, reg_no, "ECE");
    this.subjects = subjects;
    calculateCGPA();
  }

  @Override
  public void calculateCGPA() {
    int totalmarks = 0;
    int totalcredits = 0;
    for (Subject s : subjects) {
      totalmarks += s.mark * s.credits;
      totalcredits += s.credits;
    }
    this.cgpa = (float) totalmarks / totalcredits / 10;
  }
}

class AIMLStudent extends Student {
  Subject[] subjects;

  public AIMLStudent(String name, int reg_no, Subject[] subjects) {
    super(name, reg_no, "AIML");
    this.subjects = subjects;
    calculateCGPA();
  }

  @Override
  public void calculateCGPA() {
    int totalmarks = 0;
    int totalcredits = 0;
    for (Subject s : subjects) {
      totalmarks += s.mark * s.credits;
      totalcredits += s.credits;
    }
    this.cgpa = (float) totalmarks / totalcredits / 10;
  }
}

public class OOPS {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter student Name:- ");
    String name = sc.nextLine();

    System.out.print("Enter Student REG NO:- ");
    int reg_no = sc.nextInt();
    sc.nextLine(); // consume leftover newline

    System.out.print("Enter Student Branch:- ");
    String branch = sc.nextLine().toUpperCase();

    System.out.println("Enter number of subjects:- ");
    int n = sc.nextInt();

    Subject[] subject = new Subject[n];

    for (int i = 0; i < n; i++) {
      System.out.print("Enter marks for subject " + (i + 1) + ": ");
      int marks = sc.nextInt();
      System.out.print("Enter credits for subject " + (i + 1) + ": ");
      int credit = sc.nextInt();
      subject[i] = new Subject(marks, credit);
    }

    Student student;

    switch (branch) {
      case "CSE":
        student = new CSEStudent(name, reg_no, subject);
        break;
      case "ECE":
        student = new ECEStudent(name, reg_no, subject);
        break;
      case "MECH":
        student = new MECHStudent(name, reg_no, subject);
        break;
      case "AIML":
        student = new AIMLStudent(name, reg_no, subject);
        break;
      case "CIVIL":
        student = new CIVILStudent(name, reg_no, subject);
        break;
      default:
        System.out.println("Invalid branch!");
        sc.close();
        return;
    }

    student.print_details();
    sc.close();
  }
}