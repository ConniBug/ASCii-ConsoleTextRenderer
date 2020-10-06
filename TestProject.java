package testproject;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author c1bilham
 */
class TestProject {
    public static void main(String[] args) {        
        System.out.println("----------------");

        int curNum = 1;
        while(true)
        {
            String toConvert = String.valueOf(curNum);
            curNum++;
            
            String[] rows = { "", "", "", "", "", "" };
            for(int i = 0; i <= 5; i++)
            {
                for (char ch: toConvert.toCharArray()) {
                    switch(ch)
                    {
                        case('0'):
                            rows[i] +=  number_0("X", i);
                            break;
                        case('1'):
                            rows[i] +=  number_1("X", i);
                            break;
                        case('2'):
                            rows[i] +=  number_2("X", i);
                            break;                        
                        case('3'):
                            rows[i] +=  number_3("X", i);
                            break;                        
                        case('4'):
                            rows[i] +=  number_4("X", i);
                            break;   
                        case('5'):
                            rows[i] +=  number_5("X", i);
                            break;   
                        case('6'):
                            rows[i] +=  number_6("X", i);
                            break;   
                        case('7'):
                            rows[i] +=  number_7("X", i);
                            break;   
                        case('8'):
                            rows[i] +=  number_8("X", i);
                            break;   
                        case('9'):
                            rows[i] +=  number_9("X", i);
                            break;   

                        case('h'):
                            rows[i] +=  letter_H("X", i);
                            break;
                        case('H'):
                            rows[i] +=  letter_h("X", i);
                            break;

                    }
                }
            }
            System.out.println(rows[0]);
            System.out.println(rows[1]);
            System.out.println(rows[2]);
            System.out.println(rows[3]);
            System.out.println(rows[4]);

            System.out.println(" --------------------");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }

    } 
    
    public static String number_1(String item, int row) {
        switch(row)
        {
            case(0): return("  X  ");
            case(1): return("  X  ");
            case(2): return("  X  ");
            case(3): return("  X  ");
            case(4): return("  X  ");
        }
        return "NULL";
    }
    public static String number_2(String item, int row) {
        switch(row)
        {
            case(0):return("    XXXX  ");
            case(1):return("   X  X   ");
            case(2):return("     X    ");
            case(3):return("    X     ");
            case(4):return("   XXXXXX ");
        }
        return "NULL";
    }
    public static String number_3(String item, int row) {
        switch(row)
        {
            case(0):return("  XXX   ");
            case(1):return("     X  ");
            case(2):return("  XXX   ");
            case(3):return("     X  ");
            case(4):return("  XXX   ");
        }
        return "NULL";
    }
    public static String number_4(String item, int row) {
        switch(row)
        {
            case(0):return("   XX    ");
            case(1):return("  X X    ");
            case(2):return(" XXXXXX  ");
            case(3):return("    X    ");
            case(4):return("    X    ");
        }
        return "NULL";
    }
    public static String number_5(String item, int row) {
        switch(row)
        {
            case(0):return("  XXXXX  ");
            case(1):return("  X      ");
            case(2):return("  XXXX   ");
            case(3):return("      X  ");
            case(4):return("   XXX   ");
        }
        return "NULL";
    }
    public static String number_6(String item, int row) {
        switch(row)
        {
            case(0):return("   XXX   ");
            case(1):return("  X      ");
            case(2):return("  XXXX   ");
            case(3):return("  X   X  ");
            case(4):return("   XXX   ");
        }
        return "NULL";
    }
    public static String number_7(String item, int row) {
        switch(row)
        {
            case(0):return("  XXXXX ");
            case(1):return("     X  ");
            case(2):return("    X   ");
            case(3):return("   X    ");
            case(4):return("  X     ");
        }
        return "NULL";
    }
    public static String number_8(String item, int row) {
        switch(row)
        {
            case(0):return("   XXX   ");
            case(1):return("  X   X  ");
            case(2):return("   XXX   ");
            case(3):return("  X   X  ");
            case(4):return("   XXX   ");
        }
        return "NULL";
    }
    public static String number_9(String item, int row) {
        switch(row)
        {
            case(0):return("   XXXX  ");
            case(1):return("  X   X  ");
            case(2):return("   XXXX  ");
            case(3):return("      X  ");
            case(4):return("   XXX   ");
        }
        return "NULL";
    }
    public static String number_0(String item, int row) {
        switch(row)
        {
            case(0):return("   XXX   ");
            case(1):return("  X   X  ");
            case(2):return("  X   X  ");
            case(3):return("  X   X  ");
            case(4):return("   XXX   ");
        }
        return "NULL";
    }

    public static String letter_H(String item, int row) {
        switch(row)
        {
            case(0):return("  X    X  ");
            case(1):return("  X    X  ");
            case(2):return("  XXXXXX  ");
            case(3):return("  X    X  ");
            case(4):return("  X    X  ");
        }
        return "NULL";
    }
    
    public static String letter_h(String item, int row) {
        switch(row)
        {
            case(0): return("  X       ");
            case(1): return("  X       ");
            case(2): return("  XXXXX   ");
            case(3): return("  X    X  ");
            case(4): return("  X    X  ");
        }
        return "NULL";
    }
}
