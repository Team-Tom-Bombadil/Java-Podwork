public class codingBatLogic01 {

    public boolean cigarParty(int cigars, boolean isWeekend)
    {
        if(isWeekend)
            return (cigars >= 40);
        return (cigars >= 40 && cigars <= 60);
    }

    public int dateFashion(int you, int date)
    {
        if(you <= 2 || date <= 2)
            return 0;
        if(you >= 8 || date >= 8)
            return 2;
        return 1;
    }

    public boolean squirrelPlay(int temp, boolean isSummer)
    {
        if(isSummer)
            return (temp >= 60 && temp <= 100);
        return (temp >= 60 && temp <= 90);
    }

    public int caughtSpeeding(int speed, boolean isBirthday)
    {
        if(isBirthday)
            speed -= 5;
        if(speed <= 60)
            return 0;
        else if(speed <= 80)
            return 1;
        else
            return 2;
    }

    public int sortaSum(int a, int b)
    {
        int sum = a + b;
        if(sum >= 10 && sum <= 19)
            return 20;
        return sum;
    }

    public String alarmClock(int day, boolean vacation)
    {
        if(vacation)
        {
            if(day == 0 || day == 6)
                return "off";
            return "10:00";
        }
        else
        {
            if(day == 0 || day == 6)
                return "10:00";
            return "7:00";
        }
    }


    public boolean love6(int a, int b)
    {
        if(a == 6 || b == 6)
            return true;
        return ((a + b) == 6|| Math.abs(a - b) == 6);
    }


    public boolean in1To10(int n, boolean outsideMode)
    {
        if(outsideMode)
            return (n <= 1 || n >= 10);
        return (n >= 1 && n <= 10);
    }

    public boolean nearTen(int num)
    {	return (num % 10 <= 2 || num % 10 >= 8);	}

    public int teenSum(int a, int b)
    {
        if(a >= 13 && a <= 19 || b >= 13 && b <= 19)
            return 19;
        return (a + b);
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep)
    {
        if(isAsleep)
            return false;
        if(isMom)
            return true;
        return (!isMorning);
    }

    public int teaParty(int tea, int candy)
    {
        if(tea < 5 || candy < 5)
            return 0;
        if(candy >= tea*2 || tea >= candy*2)
            return 2;
        return 1;
    }


    public boolean twoAsOne(int a, int b, int c) {
        return ((a + b) == c || (b + c) == a || (c + a) == b);
    }


    public boolean inOrder(int a, int b, int c, boolean bOk)
    {
        if(bOk)
            return (c > b);
        return (b > a && c > b);
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk)
    {
        if(equalOk)
            return (a <= b && b <= c);
        return (a < b && b < c);
    }


    public boolean lastDigit(int a, int b, int c)
    {	int aD = a % 10;
        int bD = b % 10;
        int cD = c % 10;
        if(aD == bD)
            return true;
        if(aD == cD)
            return true;
        return (bD == cD);
    }

    public boolean lessBy10(int a, int b, int c) {
        return(Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(c - a) >= 10);
    }


    public int withoutDoubles(int die1, int die2, boolean noDoubles)
    {
        if(noDoubles && die1 == die2)
        {
            if(die1 == 6)
                die1 = 1;
            else
                die1++;
        }
        return die1+die2;
    }

    public int maxMod5(int a, int b)
    {
        if(a == b)
            return 0;
        if(a % 5 == b % 5)
            return (a < b) ? a : b;
        return (a > b) ? a : b;
    }

    public int redTicket(int a, int b, int c)
    {
        if(a == b && b == c)
        {
            if(a == 2)
                return 10;
            return 5;
        }
        if(a != b && a !=c)
            return 1;
        return 0;
    }


    public int greenTicket(int a, int b, int c)
    {
        if(a == b)
        {
            if(b == c)
                return 20;
            return 10;
        }
        if(a == c || b == c)
            return 10;
        return 0;
    }

    public int blueTicket(int a, int b, int c)
    {
        int ab = a + b;
        int bc = b + c;
        int ca = c + a;
        if(ab == 10 || bc == 10 || ca == 10)
            return 10;
        if(ab == bc + 10 || ab == ca + 10)
            return 5;
        return 0;
    }

    public boolean shareDigit(int a, int b)
    {
        int aDigit = a%10;
        int bDigit = b%10;
        a /= 10;
        b /= 10;
        return (a == b || a == bDigit || aDigit == b || aDigit == bDigit);
    }

    public int sumLimit(int a, int b)
    {
        int aLength = numOfDigits(a);
        int sum = a + b;
        if(aLength == numOfDigits(sum))
            return sum;
        return a;
    }

    public int numOfDigits(int num)
    {
        int count = 0;
        while(num != 0)
        {
            num /= 10;
            count++;
        }
        return count;
    }
}
