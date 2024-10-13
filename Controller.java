// import java.util.Scanner;

public class Controller {
    
    static void menu()
    {
        View.menu();
        

        int c=Input.nextInt();
        switch(c)
            {
            case 0:
                    View.end();
                    Input.end();
                    break;
            case 1:    
                {
                    int a,b;
                    View.add_all();
                    a=Input.nextInt();
                    View.add_set();
                    b=Input.nextInt();
                    View.combinationIs();
                    long n=Theorver.combination(a,b);
                    View.println(n);
                    View.end();
                    break;
                }
            case 2:
                {
                    int a;
                    View.add_set();
                    a=Input.nextInt();
                    View.discombinationIs();
                    View.println(Theorver.discombination(a));
                    View.end();
                    break;
                }

            case 3:
                {
                    int a,b;
                    double p;
                    View.add_all();
                    a=Input.nextInt();
                    View.add_set();
                    b=Input.nextInt();
                    View.add_probability();
                    p=Input.nextDouble();
                    View.combinationIs();
                    View.println(Theorver.bernulli(a,b,p));
                    View.end();
                    break;
                }
            case 4:
                {
                    double a,b;
                    int n;
                    double p;
                    String str1="Add a number of the first border", str2="Add a number of the second border", str3="The probability is ";
                    View.println(str1);
                    a=Input.nextInt();
                    View.println(str2);
                    b=Input.nextInt();
                    View.add_all();
                    n=Input.nextInt();
                    View.add_probability();
                    p=Input.nextDouble();
                    View.print(str3);
                    View.println(Theorver.int_moivre_laplace(a,b,n,p));
                    View.end();
                    break;
                }
            case 5:
                {
                    int m,n;
                    double p;
                    View.add_all();
                    n=Input.nextInt();
                    View.add_set();
                    m=Input.nextInt();
                    View.add_probability();
                    p=Input.nextDouble();
                    View.print("The probability is ");
                    View.println(Theorver.loc_moivre_laplace(n,m,p));
                    View.end();
                    break;
                }
            case 6:
                {
                    double x;
                    View.println("Add a number ");
                    x=Input.nextDouble();
                    View.print("The meaning is ");
                    View.println(Theorver.phi(x));
                    View.end();
                    break;
                }
            case 7:
                {
                    View.println("Add a number of elements ");
                    Discred_Random_Variable drv_1 = new Discred_Random_Variable();
                    drv_1.instream();
                    View.println(drv_1.expected_value());
                    break;
                }
            // case 8:
            //     {
            //         int n;
            //         String s;
            //         System.out.println("Add a number of elements ");
            //         n=Input.nextInt();
            //         Discred_Random_Variable drv_1;
            //         drv_1.instream();
            //         System.out.println(drv_1.variance());
            //         main(args);
            //         break;
            //     }
            // case 9:
            //     {
            //         int n;
            //         String s;
            //         System.out.println("Add a number of elements ");
            //         n=Input.nextInt();
            //         Discred_Random_Variable drv_1;
            //         // cin.get();
            //         drv_1.instream();
            //         System.out.println(drv_1.standard_deviation());
            //         main(args);
            //         break;
            //     }
            default:
                    System.out.println("  ");
            }


    }
}
