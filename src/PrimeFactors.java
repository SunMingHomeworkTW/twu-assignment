import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        int n=sc.nextInt();
        List<Integer> primerFactors=generate(n);
        String primerFactorsStr="";
        for (int i = 0; i < primerFactors.size(); i++) {
            primerFactorsStr+=primerFactors.get(i)+",";
        }
        if(primerFactors.size()>0)
            primerFactorsStr=primerFactorsStr.substring(0,primerFactorsStr.length()-1);
        System.out.println(primerFactorsStr);
    }

    private static List<Integer> generate(int n){
        List<Integer> primerFactorList=new ArrayList<>();
        for (int i = 2; i <=Math.sqrt((double)n); i++) {
            while(n%i==0)
            {
                primerFactorList.add(i);
                n=n/i;
            }
        }
        if(n>1)
            primerFactorList.add(n);
        return primerFactorList;
    }
}
