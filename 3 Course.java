package cc2;
import java.util.Scanner;

public class CC2 {

  
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Course: ");
        String course = sc.nextLine();
        
        if (course.equalsIgnoreCase("BSIT")){
            System.out.println("Your course is Bachelor of Science in Information Technology");
            System.out.println("Major: \n"
                    + "Network and Security (NETSEC)\n"
                    + "Web Development (WEBDEV)\n"
                    + "Enterperise Resource Planning (ERP)");
            System.out.println("Enter your major: ");
        String majorit = sc.nextLine();
        if (majorit.equalsIgnoreCase("netsec")){
            System.out.println("Your major is Network and Security");
        
        }else if (majorit.equalsIgnoreCase("webdev")){
            System.out.println("Your major is Web Development");
        }else if (majorit.equalsIgnoreCase("erp"))
            System.out.println("Your major is Enterprise Resource Planning");
        }
         if(course.equalsIgnoreCase("BSCS")) {
            System.out.println("Your course is Bachelor of Science in Computer Science");
            System.out.println("Major: \n"
                    + "Mobile Development (MOBDEV)\n"
                    + "Digital Arts and Animation (digiarts)");
             System.out.println("Enter your major: ");
            String majorcs = sc.nextLine();
        if (majorcs.equalsIgnoreCase("mobdev")){
            System.out.println("Your major is Mobile Development");
        }else if (majorcs.equalsIgnoreCase("digiarts"))
            System.out.println("Your major is Digitals Arts and Animation");
         }
             if (course.equalsIgnoreCase("BSDA")){
                System.out.println("Your course is Bachelor of Science in Data Analytics");
             }
          }

        }
            

