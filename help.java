import java.util.Scanner;
public class help extends chemistry
{
    private void help()
    {
        System.out.println("               |=================================================================================================|");
        System.out.println("               |                                               HELP & ABOUT                                      |");
        System.out.println("               |=================================================================================================|");
        System.out.println("\n"+"\n"+"\n");
        System.out.println("              CHEMISTRY ZONE is a software developed to help students new to chemistry to know more about the subject.");
        System.out.println("              Students can check almost anything over here. From serching the atomic number of an element to chemical ");
        System.out.println("              formula of a compound. It also helps newbies to learn and memorize valency and sybols of elements.      ");
        System.out.println("\n"+"\n"+"\n");
        super.menu();
    }
    public static void main()
    {
        help h1=new help();
        h1.help();
    }
}