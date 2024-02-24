import java.util.*;
public class Email {
    public static class  mail{
        private String fname;
        private String lname;
        private String password;
        private String department;
        private String email;
        private static int mailboxcapacity=500;
        private static  String alteremail;
        private  static int passlength=10;
        private String companysiffix="aeycomany.com";
        public mail(String fn,String ln){
            this.fname=fn;
            this.lname=ln;
            System.out.println("Email created :"+this.fname +" "+this.lname);
            //call a method which asking department
            this.department=setDepartment();
            System.out.println("  Department:" +this.department);

            //call a method return password

            this.password=randomPass(passlength);
            System.out.println("your password :"+ this.password);
            //combine element to generate email
            
               email=fname.toLowerCase()+"."+lname.toLowerCase()+"@"+department+"."+companysiffix;
            System.out.println("your email is:" +email);
                    
        }

    //ask for department
    private String setDepartment(){
        System.out.println(" DEPARTMENT CODE \n1 for sales \n 2 for development\n 3 forAccounting \n 4 for non \n5 Enter the department: ");
        Scanner sc=new Scanner(System.in);
        int depchoice=sc.nextInt();
        if(depchoice==1){return "sales";}
        else if(depchoice==2){  return "dev";
       }else if(depchoice==3){return "acct";}
         else {return null;}
    }
    private String randomPass(int length){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUWXYZ1234567890@#$%&";
        char[] password11=new char[length];
        for(int i=0;i<length;i++){
            int rand=(int)(Math.random() * passwordSet.length());
            password11[i]=passwordSet.charAt(rand);
        }
        return new String(password11);
    }
    ////set mailbox capacity
    public void setmailboxcapacity(int capacity){
        this.mailboxcapacity=capacity;
    }
    //set the alternate mail
    public void setalteremail(String altemail){
        this.alteremail=altemail;
    }
    //change password
    public void changepass(String pass){
        this.password=pass;
    }
    
    public int getmailboxcapacity(){
        return mailboxcapacity;
    }
    public String getalteremail(){
        return alteremail;
    }
    public String getpass(){
        return password;
    }
    public String showinfo(){
        return "Dispaly name:"+fname+" "+lname
                +"  "+"Comany mail:"+email+
                "  "+"Maibox capacity:"+ mailboxcapacity +"mb";
    }
}
    public static void main(String[] args) {
       mail em1=new mail("mansi","khistariya");
       System.out.println(em1.showinfo());
//       em1.setalteremail("js@gmail.com");
//        System.out.println(em1.getalteremail());

        
    }
    

    
}
