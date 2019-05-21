package skillenza.solum.missingdigit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Solution {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        Integer testcase = Integer.valueOf(in.nextInt());
        List<Integer > sums = new ArrayList<>();
        while(testcase > 0)
        {
            Integer sum = 0;
            boolean altswitch = true;
            String a = in.next();
            String reversedStr = new StringBuilder(a).reverse().toString();
            AtomicLong lNum = new AtomicLong(0L);
            lNum.set(Long.parseLong(reversedStr));
            sums.add(lNum);
            testcase--;
        }
        
        System.out.println(sums);
        
        in.close();
    }

    private static Integer getConsolidatedNumber(int num)
    {
        // TODO Auto-generated method stub
        return null;
    }
    

}
