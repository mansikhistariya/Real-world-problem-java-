package com.mycompany.mavenproject1;
import java.util.*;
/**
 *
 * @author admin
 */
public class Mavenproject1 {
    public static class Student{
        //encapsulation private
        //enter name 
        private String fname;
        private String lname;
        private int gradeyear;
        private int studentId;
        private String courses="";
        private static int tuitionBalance=0;
        private  static int costofcourse=600;
        private static int id=1000;
        public Student(){
            //enter name and yera
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the fname:");
            this.fname=sc.nextLine();
            
            System.out.println("enter the lname:");
            this.lname=sc.nextLine();
            
            System.out.println("1-freshmen \n2-sophmore\n3-junior\nenter student class level:");
            this.gradeyear=sc.nextInt();
            
            setstudentId();
            
//            System.out.println(fname+" "+lname+" "+gradeyear+" "+studentId);
            //autoincrement id
           
        }
        //genetate  id unique
        private void setstudentId(){
             id++;
            
            //grade level+id
            this.studentId=gradeyear + id;
            
        }
        //enroll course
        private void enroll(){
            do{
            System.out.println("enroll the course:(Q for quite):");
            Scanner sc=new Scanner(System.in);
            String c=sc.next();
            if(!c.equals("Q")){
               courses=courses+" \n"+c;
               tuitionBalance=tuitionBalance+costofcourse;
            }
            else{
                break;
            }
            }while(1!=0);
            System.out.println("enroll IN:"+courses);
            System.out.println("BaLANCE:"+tuitionBalance);
        }
        //view balance 
        public void vbalance(){
            System.out.println(" your balance:"+tuitionBalance);
        }
        //payment 
        public void paytuition(){
            System.out.print("enter your payment:");
            Scanner sc=new Scanner(System.in);
            int payment=sc.nextInt();
            tuitionBalance=tuitionBalance-payment;
            System.out.println("thanks for payment:"+payment);
            vbalance();
        }
        //show status 
        public String showinfo(){
            return "name:"+fname+" "+lname+
                    "\ngrade level:"+gradeyear+
                    "\nStudent id:"+studentId+
                    "\ncourses enroll:"+courses+
                    "\nbalance $:"+tuitionBalance;
        }
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.enroll();
        s1.paytuition();
       System.out.println( s1.showinfo());
        
    }
}
