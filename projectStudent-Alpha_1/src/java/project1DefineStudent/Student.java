
package project1DefineStudent;

public class Student {
  
    String fname = "";
    String lname = "";
    String address1 = "",address2 = "";
    String contact = "";
    String email="";
    String pass="";
    int semNo=0;
    int semMarks=0;
    String deptId="";
    int clgId=000;
    String stdReg="";
    int su = 0;
    public String err="null";
    
 public Student(){
     System.out.println("in default ctor");
     err = "null";
    }
    public Student(String iemail,String ipass){
        System.out.println("in 2 param ctor");
      email = iemail;
      pass = ipass;
      
    }
    public Student(String iemail,String ipass,String ierr){
        System.out.println("in 3 param ctor");
      email = iemail;
      pass = ipass;
      err = ierr;
    }
   public Student(String iname, String iemail, String ipass, String idept) {
        System.out.println("setting object ctor");
        fname = iname;
        email = iemail;
        pass = ipass;
        deptId = idept;
       
    }
    public Student(String iname, String iemail, String ipass, String idept,int isu) {
        System.out.println("setting object ctor");
        fname = iname;
        email = iemail;
        pass = ipass;
        deptId = idept;
        su = isu;
    }
    
    public Student(String fname,String lname,String address1,String address2,String contact,String email,String pass,int semNo,
            int semMarks,int su,String deptId,int clgId,String stdReg,String err){
    
    
        this.fname=fname;
        this.lname=lname;
        this.address1=address1;
        this.address2=address2;
        this.contact=contact;
        this.email=email;
        this.pass=pass;
        this.semNo=semNo;
        this.semMarks=semMarks;
        this.su = su;
        this.deptId=deptId;
        this.clgId=clgId;
        this.stdReg=stdReg;
        this.err = err;
    }



     public String getFName(){
     return fname;
    }
    public String getLName(){
     return lname;
    }
    public String getAddress1(){
     return address1;
    }
    
    public String getAddress2(){
     return address2;
    }
    
    public String getContact(){
     return contact;
    }
    
    public String getEmail(){
     return email;
    }
    public String getPass(){
     return pass;
    }
     public int getSemNo(){
     return semNo;
    }
   
     public int getSemMarks(){
     return semMarks;
    }
   public String getDeptId(){
     return deptId;
    }
   public int getClgId(){
     return clgId;
    }
   
   public String getStdReg(){
     return stdReg;
    }
   public int getSu(){
     return su;
    }
}
