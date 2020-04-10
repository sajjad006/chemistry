import java.util.Scanner;
class element extends chemistry
{
    private String ename,sname;
    private static element ob=new element();
    private int choice,atomicnum,i,vnumber;
    protected int ano[]=new int [118];
    protected int anolength=ano.length;
    protected String element[]={"Hydrogen","Helium","Lithium","Beryllium","Boron","Carbon","Nitrogen","Oxygen","Flourine","Neon","Sodium",
    "Magnesium","Aluminium","Silicon","Phosphorus","Sulphur","Chlorine","Argon","Potassium","Calcium","Scandium","Titanium","Vanadium",
    "Chromium","Manganese","Iron","Cobalt","Nickel","Copper","Zinc", "Galium","Germanium","Arsenic","Selenium","Bromine","Krypton",
    "Rubidium","Strontium","Yttrium","Zirconium","Niobium","Molybdenum","Technetium","Ruthenium","Rhodium","Palladium","Silver","Cadmium",
    "Indium","Tin",""};
    private boolean flag=false;    
    protected String symbol[]={"H","He","Li","Be","B","C","N","O","F","Ne","Na","Mg","Al","Si","P","S","Cl","Ar","K","Ca","Sc","Ti","V","Cr","Mn",
    "Fe","Co","Ni","Cu","Zn","Gn","Ge","As","Se","Br","Kr","Rb","Sr","Y","Zr","Nb","Mo","Tc","Ru","Rh","Pd","Ag","Cd","In","Sn",""};
    protected int valency[]={1,0,1,2,3,4,3,2,1,0,1,2,3,4,3,2,1,0,1,2,3,4,3,2,1,2,2,2,1,2,3,4,3,2,1,0,1,2,3,4,3,2,1,2,2,2,1,2,3,4,0};
    
    protected String radical[]={"Ammonium","Ferrous","Feric","Cupprous","Cupric","Stannous","Chloride","Bromide","Iodide","Hydroxide",
    "Acetate","Nitrate","Nitrite","Bisulphate","Bisulphite","Bicarbonate","Oxide","Carbonate","Sulphate","Sulphite","Dichromate","Nitride",
    "Phosphate"};
    
    protected String [] radsymb={"NH4","Fe","Fe","Cu","Cu","Sn","Cl","Br","I","OH","CH3COO","NO3","NO2","HSO4","HSO4","HCO3","O","CO3","SO4",
    "SO3","Cr2O7","N","PO4"};
    
    protected int [] radval={1,2,3,1,2,4,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-2,-2,-2,-2,-2,-3,-3};
    element(){
        atomicnum=0;
        ename="null";
        sname="null";
        vnumber=0;
    }
    protected void data()
    {
        for(i=0;i<ano.length;i++)
        {
            ano[i]=i+1;
        }
    }
    protected void menu()
    {
        super.menu();
    }
    private void input()
    {
        Scanner sc=new Scanner(System.in);
        Scanner input=new Scanner(System.in);
        System.out.println("Please select what you want to enter by giving the number of the respective options:");
        System.out.println();
        System.out.println("1.Atomic Number"+"\t"+"2.Element name "+"\t"+"3.Symbol       "+"\t"+"4.Valency      "+"\t");
        System.out.println();
        try{
            choice=sc.nextInt();}
        catch(Exception e){invalid();}
        switch(choice)
        {
            case 1:
                System.out.println("Enter atomic number:");
                try{
                    atomicnum=sc.nextInt();
                }
                catch(Exception e){invalid();}
                break;
            case 2:
                System.out.println("Enter Element Name:");
                ename=input.nextLine();
                break;    
            case 3:
                System.out.println("Enter Symbol:");
                sname=input.nextLine();
                break;
            case 4:
                System.out.println("Enter Valency:");
                try{
                    vnumber=input.nextInt();
                }
                catch(Exception e)
                {invalid();}
                break;
            default:
                invalid();
                break;
        }
    }
    private void search()
    {
        if(choice==1)
        {
            try{
                atomicnum=atomicnum;
                ename=element[atomicnum-1];
            }
            catch(Exception e){invalid();}
            sname=symbol[atomicnum-1];
            vnumber=valency[atomicnum-1];
            ob.display();
        }
        else if(choice==2)
        {
            for (int i=0;i<element.length;i++)
            {
                if (element[i].equalsIgnoreCase(ename))
                {
                    atomicnum=i+1;
                    ename=element[i];
                    sname=symbol[i];
                    vnumber=valency[i];
                    flag=true;
                    ob.display();
                }
            }
            if (flag==false)
            {
                System.out.println("Element not found"+"\n"+"\n"+"\n");
                invalid();
            }
        }
        else if(choice==3)
        {
            for (int i=0;i<symbol.length;i++)
            {
                if (symbol[i].equalsIgnoreCase(sname))
                {
                    atomicnum=i+1;
                    ename=element[i];
                    sname=symbol[i];
                    vnumber=valency[i];
                    flag=true;
                    ob.display();
                }
            }
            if (flag==false)
            {
                System.out.println("Element not found with symbol "+sname+"\n"+"\n"+"\n");
                invalid();
            }
        }
        else if(choice==4)
        {
            if(flag==true)
            {
                System.out.println("Elements with valency "+vnumber+":");
                System.out.println();
                System.out.println("A.Num"+"\t"+"Element"+"\t"+"\t"+"Symbol"+"\t"+"\t"+"Valency");
                System.out.println();
            }
            for (int i=0;i<valency.length;i++)
            {
                if (valency[i]==(vnumber))
                {
                    atomicnum=i+1;
                    ename=element[i];
                    sname=symbol[i];
                    vnumber=valency[i];                    
                    System.out.println(atomicnum+"\t"+ename+"\t"+"\t"+sname+"\t"+"\t"+vnumber);
                    flag=true;                    
                }
            }
            if (flag==false)
            {
                System.out.println("Oops! Element not found with valency "+vnumber);               
            }
        }
    }
    private void display()
    {
        System.out.println();
        System.out.println("==========Result==========");
        System.out.println("Atomic Number :  "+atomicnum);
        System.out.println("Element Name  :  "+ename);
        System.out.println("Element Symbol:  "+sname);
        System.out.println("Valency       :  "+vnumber);
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
        System.out.println("               |                                           ATOMIC DETAILS                                        |");
        System.out.println("               |=================================================================================================|");
        ob.data();
        ob.input();
        ob.search(); 
        ob.menu();
    }
}