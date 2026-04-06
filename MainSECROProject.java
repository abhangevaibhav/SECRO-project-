import java.util.*;

public class MainSECROProject {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Strength or capacity of Class:");
        int Strength = sc.nextInt();
        System.out.println("Enter Number of Subjects:");
        int Subjects = sc.nextInt();
        System.out.print("Enter Name of individual subjects:");
        String[] Subjectnames = new String[Subjects];
        for (int i = 1; i <= Subjects; i++) {
            Subjectnames[i - 1] = sc.next();
        }
        System.out.println("Enter number of Classrooms are there in your institue:");
        int numclassrooms = sc.nextInt();
        System.out.println("Enter the number of all classrooms like 301,302,303,....");
        String[] Classname = new String[numclassrooms];
        for (int j = 1; j <= numclassrooms; j++) {
            Classname[j - 1] = sc.next();
        }
        System.out.println("Enter number of Faculty members:");
        int numfaculty = sc.nextInt();
        System.out.println("Enter number of labs:");
        int numlabs = sc.nextInt();
        String[] Labnames = new String[numlabs];
        System.out.println("Enter name of each Labs:");
        for (int k = 1; k <= numlabs; k++) {
            Labnames[k - 1] = sc.next();
        }
    }

}