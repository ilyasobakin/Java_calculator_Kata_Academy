import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);
        String s = console.nextLine();


        System.out.println(s);


        //String s = "1 + 2";

        int a = 0;
        int b = 0;
        int c = 0;

        String s1 = "";
        String s2 = "";

        char znak = ' ';

        int x = 0;
        int ii = 0;

        boolean first = false;
        boolean second = false;
        boolean middle = false;

        boolean redFlag = false;


        for (int i = 0; i < s.length(); i++)
        {
            if (!first && s.charAt(i) == ' ')
            {
                first = true;
                for (int j = 0; j < i; j++) {
                    s1 += s.charAt(j);
                }
            }
            else if (first && !middle && s.charAt(i) != ' ' && !second)
            {
                znak = s.charAt(i);
                middle = true;
            }
            else if (first && middle && !second && s.charAt(i) == ' ')
            {
                second = true;
                for (int j = i + 1; j < s.length(); j++) {
                    s2 += s.charAt(j);
                }
            }
            else if (first && middle && second && s.charAt(i) == ' ')
            {
                redFlag = true;
            }
        }


        String r = "100";
        int A = Integer.valueOf(r);

        //============================

        boolean f = false;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == ' ') f = true;
        }
        if (!f)
        {
            System.out.println("throws Exception");
            System.exit(0);
        }

        if (s1.charAt(0) == 0 || s2.charAt(0) == 0)
        {
            redFlag = true;
            System.out.println("throws Exception");
            System.exit(0);
        }
        else if ((s1.charAt(0) >= '1' && s1.charAt(0) <= '9') &&
                (s2.charAt(0) <= '1' && s2.charAt(0) >= '9'))
        {
            redFlag = true;
            System.out.println("throws Exception");
            System.exit(0);
        }
        else if ((s2.charAt(0) >= '1' && s2.charAt(0) <= '9') &&
                (s1.charAt(0) <= '1' && s1.charAt(0) >= '9'))
        {
            redFlag = true;
            System.out.println("throws Exception");
            System.exit(0);
        }
        else if (s1.charAt(0) <= '0' && s1.charAt(0) >= '9')
        {
            int counter = 0;
            for (int i = 0; i < s1.length(); i++)
            {
                if (s1.charAt(i) == 'X') counter++;
                if (s1.charAt(i) == 'L') redFlag = true;
                if (s1.charAt(i) == 'C') redFlag = true;
                if (s1.charAt(i) == 'D') redFlag = true;
            }
            if (counter > 1)
            {
                redFlag = true;
                System.out.println("throws Exception");
                System.exit(0);
            }
        }
        else if (s2.charAt(0) <= '0' && s2.charAt(0) >= '9')
        {
            int counter = 0;
            for (int i = 0; i < s2.length(); i++)
            {
                if (s1.charAt(i) == 'X') counter++;
                if (s1.charAt(i) == 'L')
                {
                    redFlag = true;
                    System.out.println("throws Exception");
                    System.exit(0);
                }
                if (s1.charAt(i) == 'C')
                {
                    redFlag = true;
                    System.out.println("throws Exception");
                    System.exit(0);
                }
                if (s1.charAt(i) == 'D')
                {
                    redFlag = true;
                    System.out.println("throws Exception");
                    System.exit(0);
                }
            }
            if (counter > 1)
            {
                redFlag = true;
                System.out.println("throws Exception");
                System.exit(0);
            }
        }
        else if (s1.charAt(0) > '0' && s1.charAt(0) <= '9')
        {
            for (int i = 0; i < s1.length(); i++)
            {
                if (s1.charAt(i) == '.' || s1.charAt(i) == ',')
                {
                    redFlag = true;
                    System.out.println("throws Exception");
                    System.exit(0);
                }
            }
        }
        else if (s2.charAt(0) > '0' && s2.charAt(0) <= '9')
        {
            for (int i = 0; i < s2.length(); i++)
            {
                if (s2.charAt(i) == '.' || s2.charAt(i) == ',')
                {
                    redFlag = true;
                    System.out.println("throws Exception");
                    System.exit(0);
                }
            }
        }
        else if (s1.charAt(0) >= '1' && s1.charAt(0) <= '9' && Integer.valueOf(s1) > 10)
        {
            redFlag = true;
            System.out.println("throws Exception");
            System.exit(0);
        }
        else if (s2.charAt(0) >= '1' && s2.charAt(0) <= '9' && Integer.valueOf(s2) > 10)
        {
            redFlag = true;
            System.out.println("throws Exception");
            System.exit(0);
        }

        if (redFlag)
        {
            System.out.println("throws Exception");
            System.exit(0);
        }

        //===================

        if (!redFlag && s1.charAt(0) > '0' && s1.charAt(0) <= '9')
        {
            if (znak == '+') System.out.println(Integer.valueOf(s1) + Integer.valueOf(s2));
            if (znak == '-') System.out.println(Integer.valueOf(s1) - Integer.valueOf(s2));
            if (znak == '*') System.out.println(Integer.valueOf(s1) * Integer.valueOf(s2));
            if (znak == '/' && !(s2.equalsIgnoreCase("0"))) System.out.println(Integer.valueOf(s1) / Integer.valueOf(s2));
        }
        else if (!redFlag)
        {
            a = 10;
            b = 10;


            boolean flag = false;

            if (s1.equalsIgnoreCase("I")) {a = 1; flag = true;}
            else if (s1.equalsIgnoreCase("II")) {a = 2; flag = true;}
            else if (s1.equalsIgnoreCase("III")) {a = 3; flag = true;}
            else if (s1.equalsIgnoreCase("IV")) {a = 4; flag = true;}
            else if (s1.equalsIgnoreCase("V")) {a = 5; flag = true;}
            else if (s1.equalsIgnoreCase("VI")) { a = 6; flag = true;}
            else if (s1.equalsIgnoreCase("VII")) {a = 7; flag = true;}
            else if (s1.equalsIgnoreCase("VIII")) {a = 8; flag = true;}
            else if (s1.equalsIgnoreCase("IX")) {a = 9; flag = true;}
            else if (s1.equalsIgnoreCase("X")) {a = 10; flag = true;}

            if (!flag)
            {
                redFlag = true;
                System.out.println("throws Exception");
                System.exit(0);
            }


            flag = false;

            if (s2.equalsIgnoreCase("I")) {b = 1; flag = true;}
            else if (s2.equalsIgnoreCase("II")) {b = 2; flag = true;}
            else if (s2.equalsIgnoreCase("III")) {b = 3; flag = true;}
            else if (s2.equalsIgnoreCase("IV")) {b = 4; flag = true;}
            else if (s2.equalsIgnoreCase("V")) {b = 5; flag = true;}
            else if (s2.equalsIgnoreCase("VI")) {b = 6; flag = true;}
            else if (s2.equalsIgnoreCase("VII")) {b = 7; flag = true;}
            else if (s2.equalsIgnoreCase("VIII")) {b = 8; flag = true;}
            else if (s2.equalsIgnoreCase("IX")) {b = 9; flag = true;}
            else if (s2.equalsIgnoreCase("X")) {b = 10; flag = true;}

            if (!flag)
            {
                redFlag = true;
                System.out.println("throws Exception");
                System.exit(0);
            }


            if (znak == '+') c = a + b;
            else if (znak == '-') c = a - b;
            else if (znak == '*') c = a * b;
            else if (znak == '/' && b != 0) c = a / b;

            String sAns = "";

            if (!redFlag && c > 0)
            {
                if (c / 10 == 1) sAns += 'X';
                else if (c / 10 == 2) sAns += "XX";
                else if (c / 10 == 3) sAns += "XXX";
                else if (c / 10 == 4) sAns += "XL";
                else if (c / 10 == 5) sAns += "L";
                else if (c / 10 == 6) sAns += "LX";
                else if (c / 10 == 7) sAns += "LXX";
                else if (c / 10 == 8) sAns += "LXXX";
                else if (c / 10 == 9) sAns += "XC";
                else if (c / 10 == 10) sAns += "C";

                if (c % 10 == 1) sAns += 'I';
                else if (c % 10 == 2) sAns += "II";
                else if (c % 10 == 3) sAns += "III";
                else if (c % 10 == 4) sAns += "IV";
                else if (c % 10 == 5) sAns += "V";
                else if (c % 10 == 6) sAns += "VI";
                else if (c % 10 == 7) sAns += "VII";
                else if (c % 10 == 8) sAns += "VIII";
                else if (c % 10 == 9) sAns += "IX";
                else if (c % 10 == 10) sAns += 'X';

                System.out.println(sAns);
            }
            else redFlag = true;

        }

        if (redFlag)
        {
            System.out.println("throws Exception");
            System.exit(0);
        }



    }
}

