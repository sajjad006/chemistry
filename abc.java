import java.util.*;
class abc extends element
{
    private static Scanner sc=new Scanner(System.in);
    private String cname,felement,f,selement,s1,s2;
    private boolean mark=false,isRad=false;
    private int val1,val2,hcf;
    abc()
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
    private void search(String[] se,String e,int val,String s,int[] v,String[] sa)
    {
        int z=0;
        for(int i=0;(i<se.length);i++)
        {
            if(se[i].equalsIgnoreCase(e))
            {
                mark=true;
                z=i;
            }
        }
        if(mark==true){
            if(val<0)
            val=(-1)*v[z];
            else
            val=v[z];
            s=sa[z];;
        }
        else
        mark=false;
        System.out.println(e+" "+val+" "+s);
    }
    void searchImp()
    {
        search(radical,felement,val1,s1,radval,radsymb);
        if(mark==false)
        search(element,felement,val1,s1,valency,symbol);
        if(mark==false)
        invalid();
        search(radical,selement,val2,s2,radval,radsymb);
        if(mark==false)
        search(element,selement,val2,s2,valency,symbol);
        if(mark==false)
        invalid();
    }
    private void formula()
    {
        searchImp();
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
        abc f1=new abc();
        
        f1.input();
        f1.compoundname();
        f1.formula();
        f1.menu();
    }
}