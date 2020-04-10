import java.util.Scanner;
class radical extends chemistry
{   
    String radical[]={"Ammonium","Ferrous","Feric","Cupprous","Cupric","Stannous","Chloride","Bromide","Iodide","Hydroxide",
    "Acetate","Nitrate","Nitrite","Bisulphate","Bisulphite","Bicarbonate","Oxide","Carbonate","Sulphate","Sulphite","Dichromate","Nitride",
    "Phosphate"};
    
    String [] radsymb={"NH4","Fe","Fe","Cu","Cu","Sn","Cl","Br","I","OH","CH3COO","NO3","NO2","HSO4","HSO4","HCO3","O","CO3","SO4",
    "SO3","Cr2O7","N","PO4"};
    
    int [] radval={1,2,3,1,2,4,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-2,-2,-2,-2,-2,-3,-3};
    String rad,rs,rt;
    int rv,n;
    boolean flag=false;
    private void input()
    {
        Scanner sc=new Scanner(System.in);
        Scanner input=new Scanner(System.in);
        System.out.println("1.Radical Name"+"\t"+"2.Radical Symbol");
        try{
        n=sc.nextInt();}
        catch(Exception e){invalid();}
        switch(n)
        {
            case 1: 
                System.out.println("Enter the name of a radical:");
                rad=input.nextLine();
                radsearch();
                break;
            case 2:
                System.out.println("Enter Radical Symbol:");
                rs=input.nextLine();
                radsearch();
                break;
            default:
                System.out.println("Invalid input");
                invalid();
                break;
        }
    }
    private void radsearch()
    {
        if(n==1){
            for(int i=0;i<radical.length;i++)
                {
                    if(radical[i].equalsIgnoreCase(rad))
                    {
                        rad=radical[i];
                        rs=radsymb[i];
                        rv=radval[i];
                        rt=((rv>0)?"Basic":"Acidic");
                        flag=true;
                    }
                }       
            if(flag==true)
                display();
            else 
                invalid();
        }
        else if(n==2)
        {
            for(int i=0;i<radsymb.length;i++)
            {
                if(radsymb[i].equals(rs))
                {
                    rs=radsymb[i];
                    rad=radical[i];
                    rv=radval[i];
                    rt=((rv>0)?"Basic":"Acidic");
                    flag=true;
                    display();
                }
                else if(radsymb[i].equalsIgnoreCase(rs)){
                    System.out.println();
                    System.out.println(rs+" is improperly capitalized");
                    flag=true;
                }
            }   
            if(flag==false)
                invalid();
        }
    }
    protected void invalid()
    {
        System.out.print('\u000C');
        System.out.println("Invalid input!!!!");
        menu();
    }
    protected void menu(){super.menu();}
    private void display()
    {
        System.out.println();
        System.out.println("==========Result==========");
        System.out.println("Radical Name      :  "+rad);
        System.out.println("Radical Type      :  "+rt);
        System.out.println("Radical Symbol    :  "+rs);
        System.out.println("Radical Valency   :  "+rv);
    }
    public static void main()
    {
        System.out.println("               |=================================================================================================|");
        System.out.println("               |                                              RADICAL                                            |");
        System.out.println("               |=================================================================================================|");
        radical r=new radical();
        r.input();
        r.menu();
    }
}