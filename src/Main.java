import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList();
        int num = Integer.parseInt(sc.nextLine());
        for(int i =0;i<num;i++)
        {
            String name = sc.nextLine();
            list.add(name);
            if(list.size()<=4)
            {
                printfun(list);
            }
            else
            {
                list.remove(0);
                printfun(list);
            }
        }
    }
    private static void printfun(ArrayList<String> list)
    {
        for(int j = 0;j<list.size();j++)
        {
            System.out.print(j+1+"="+ list.get(list.size() - 1 - j) +" ");

        }System.out.println();
    }
}
