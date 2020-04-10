import java.util.Scanner;
class login extends element
{
    boolean uflag=false,pflag=false;
    int eno=0;static String u_id="";
    void passvalid()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your username:");
        u_id=sc.nextLine();
        if(u_id.equals("Sajjad Ahmed"))
        {
            System.out.println("Enter your password:");
            String pass=sc.nextLine();
            if (pass.equals("shaaz2012015U62KE9"))
            pflag=true;
            else
            pflag=false;
        }
        else{
            System.out.println("Invalid User-id");
            passvalid();
        }
        if(pflag==false){
            System.out.println("\u000C");
            System.out.println("Invalid password");
            passvalid();
        }
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Add Element"+"\t"+"2. Add Radical"+"\t"+"3. Logout");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
                System.out.println("\u000C");
                addelement();
                break;
            case 2:
                System.out.println("\u000C");
                addradical();
                break;
            case 3:
                System.out.println("\u000C");
                chemistry.main(new String[] {"a","b","c"});
                break;
        }
    }
    void addelement()
    {
        Scanner sc=new Scanner(System.in);
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Atomic Number Of Element:");
        try{
            eno=sc.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("\u000C");
            System.out.println("Invalid input!!");
            input();
        }
        System.out.println("Enter name of element:");
        String en=input.nextLine();
        element[eno]=en;
        System.out.println("Enter symbol of the element:");
        String es=input.nextLine();
        symbol[eno]=es;
        System.out.println("Enter valency of the element:");
        int ev=input.nextInt();
        valency[eno]=ev;
    }
    void addradical()
    {
    
    }
    public static void main()
    {
        System.out.println("               |=================================================================================================|");
        System.out.println("               |                                           WELCOME"+" "+u_id+"                                |");
        System.out.println("               |=================================================================================================|");
        login l=new login();
        l.passvalid();
        l.input();
    }
}