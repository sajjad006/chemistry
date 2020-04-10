import java.util.*;
class chemistry
{
    private int n=0;    
    void menu()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("    |-----------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("    |    "+"\t"+"1.Chemical Formula"+"\t"+"2.Element Details"+"\t"+"3.Chemical Equation"+"\t"+"4.Radical"+"\t"+"5.Help"+"\t"+"\t"+"6.Exit"+"\t"+"\t"+"|");
        System.out.println("    |-----------------------------------------------------------------------------------------------------------------------------------|");
        try{
            n=sc.nextInt();
        }
            catch(Exception e)
            {invalid();}
        switch(n)
        {
            case 1:
                System.out.print('\u000C');
                formula.main();    
                break;
            case 2:
                System.out.print('\u000C');
                element.main();
                break;
            case 3:
                System.out.print('\u000C');
                cequation.main();
                break;
            case 4:
                System.out.println('\u000C');
                radical.main();
                break;
            case 5:
                System.out.print('\u000C');
                help.main();
                break;
            case 6:
                System.out.print('\u000C');
                System.exit(0);
                break;
            default:
                System.out.print('\u000C');
                System.out.println("Invalid Input!!!!");
                chemistry.main(new String[] {"a","b","c"});
                break;
        }
    }
    private void invalid()
    {
        System.out.print('\u000C');
        System.out.println("Invalid input!!!!");
        menu();
    }
    public static void main(String[] args)
    {

        System.out.println("               |=================================================================================================|");
        System.out.println("               |                                       CHEMISTRY ZONE                                            |");
        System.out.println("               |=================================================================================================|");
        System.out.println();
        chemistry c1=new chemistry();
        c1.menu();
    }
}