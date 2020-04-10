import java.util.*;
class formula extends element
{
    private static Scanner sc=new Scanner(System.in);
    private String cname,felement,f,selement,s1,s2;
    private boolean mark=false,isRad=false;
    private int val1,val2,hcf;
    formula()
    {
        val1=-1;val2=-1;s1="";s2="";
    }
    private int hcf(int a,int b)
    {
        while(a!=0)
        {
            int r=b%a;
            b=a;
            a=r;
        }
        return b;
    }
    private void input()
    {
        System.out.println("Enter chemical name separated by space:");
        cname=sc.nextLine();
    }
    protected void menu()
    {
        super.menu();
    }
    private void compoundname()
    {
        for(int i=0;i<=cname.length()-1;i++)
        {
            if(cname.charAt(i)==' ')
            {
                felement=cname.substring(0,i);
                selement=cname.substring((i+1),cname.length());
            }
        }
    }
    private void search()
    {
        int z=0;
        for(int i=0;(i<element.length);i++)
        {
            if(element[i].equalsIgnoreCase(felement))
            {
                mark=true;
                z=i;
            }
        }
        if(mark==true)
        {
            val1=valency[z];
            s1=symbol[z];
        }
        else{invalid();mark=false;}
        z=0;
        for(int i=0;(i<radical.length);i++)
        {
            if(radical[i].equalsIgnoreCase(selement))
            {
                mark=true;
                z=i;
                break;
            }
            else
            mark=false;
        }
        if(mark==true){
            val2=radval[z];
            s2=radsymb[z];
            if(val2<0)
            val2=(-1)*radval[z];
            else
            val2=radval[z];
            display(felement,val1,s1);
            display(selement,val2,s2);
        }
        else
        invalid();mark=false;
    }
    private void formula()
    {
        if(val1==0 || val2==0)
        {
            invalid();
        }
        hcf=hcf(val1,val2);
        val1=val1/hcf;
        val2=val2/hcf;
        if((val1==1) && (val2==1))
            f=s1+s2;
        else if((val1==1) && (val2!=1))
            f=s1+val2+s2;
        else if((val2==1) && (val1!=1))
            f=s1+s2+val1;
        else
            f=s1+val2+s2+val1;
        System.out.println("Chemical Formula of "+cname+" is "+f);
        System.out.println("\n"+"\n"+"\n");
    }
    private void display(String name,int val,String symb)
    {
        System.out.println();
        System.out.println("Details of "+name+":"+"\n");
        System.out.println("Element Name  :  "+name);
        System.out.println("Element Symbol:  "+symb);
        System.out.println("Valency       :  "+val);
        System.out.println("-------------------------------------------------------------------------------------------");
    }
    protected void invalid()
    {
        System.out.print('\u000C');
        System.out.println("Invalid input!!!!");
        menu();
    }
    public static void main()
    {
        System.out.println("               |=================================================================================================|");
        System.out.println("               |                                       CHEMICAL FORMULA ZONE                                     |");
        System.out.println("               |=================================================================================================|");
        formula f1=new formula();
        
        f1.input();
        f1.compoundname();
        f1.search();
        f1.formula();
        f1.menu();
    }
}