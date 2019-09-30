public class codingBatArray01 {

    public boolean firstLast6(int[] num)
    {	return (num[0] == 6 || num[num.length-1] == 6);	}


    public boolean sameFirstLast(int[] num)
    {	return (num.length >= 1 && num[0] ==  num[num.length-1]);}

    public int[] makePi()
    {
        int[] arr = {3, 1, 4};
        return arr;
    }

    public boolean commonEnd(int[] a, int[] b)
    {	return (a[0] == b[0] || a[a.length-1] == b[b.length-1]);	}

    public int sum3(int[] num)
    {	return (num[0] + num[1] + num[2]);	}

    public int[] rotateLeft3(int[] num)
    {
        int[] arr = {num[1], num[2], num[0]};
        return arr;
    }

    public int[] reverse3(int[] num)
    {
        int[] arr = {num[2], num[1], num[0]};
        return arr;
    }

    public int[] maxEnd3(int[] num)
    {
        int max = num[0] > num[2] ? num[0] : num[2];
        num[0] = max;
        num[1] = max;
        num[2] = max;

        return num;
    }

    public int sum2(int[] num)
    {
        if(num.length >= 2)
            return (num[0] + num[1]);
        if(num.length == 1)
            return num[0];
        return 0;
    }

    public int[] middleWay(int[] a, int[] b)
    {
        int[] arr = {a[1], b[1]};
        return arr;
    }

    public int[] makeEnds(int[] num)
    {
        int[] arr = {num[0], num[num.length-1]};
        return arr;
    }

    public boolean has23(int[] num)
    {
        if(num[0] == 2 || num[0] == 3)
            return true;
        return (num[1] == 2 || num[1] == 3);
    }

    public boolean no23(int[] num)
    {
        if(num[0] == 2 || num[0] == 3)
            return false;
        return !(num[1] == 2 || num[1] == 3);
    }


    public int[] makeLast(int[] num)
    {
        int[] arr = new int[2 * num.length];
        arr[arr.length - 1] = num[num.length - 1];

        return arr;
    }


    public boolean double23(int[] num)
    {
        if(num.length == 2)
        {
            if(num[0] == 2 && num[1] == 2)
                return true;
            return (num[0] == 3 && num[1] == 3);
        }
        return false;
    }


    public int[] fix23(int[] num)
    {
        for(int i = 0; i < num.length - 1; i++) {
            if(num[i] == 2 && num[i + 1] == 3)
                num[i + 1] = 0;
        }

        return num;
    }


    public int start1(int[] a, int[] b)
    {
        int ones = 0;
        if(a.length >= 1 && a[0] == 1)
            ones += 1;
        if(b.length >= 1 && b[0] == 1)
            ones += 1;
        return ones;
    }


    public int[] biggerTwo(int[] a, int[] b)
    {
        int sum = a[0]+a[1]-b[0]-b[1];
        if(sum >= 0)
            return a;
        return b;
    }


    public int[] makeMiddle(int[] num)
    {
        return new int[] {num[num.length / 2 - 1], num[num.length / 2]};

    }
    public int[] plusTwo(int[] a, int[] b)
    {
        int[] arr = {a[0], a[1], b[0], b[1]};
        return arr;
    }

    public int[] swapEnds(int[] num)
    {
        int temp = num[0];
        num[0] = num[num.length-1];
        num[num.length-1] = temp;
        return num;
    }



    public int[] midThree(int[] num)
    {
        int[] arr = new int[3];
        arr[0] = num[num.length / 2 - 1];
        arr[1] = num[num.length / 2];
        arr[2] = num[num.length / 2 + 1];
        return arr;
    }


    public int maxTriple(int[] num)
    {
        int max = num[0];
        if(max <= num[num.length-1])
            max = num[num.length-1];
        if(max <= num[num.length/2])
            max = num[num.length/2];
        return max;
    }


    public int[] frontPiece(int[] num)
    {
        int[] arr;
        if(num.length < 2)
            arr = new int[num.length];
        else
            arr = new int[2];

        if(num.length > 0)
            arr[0] = num[0];

        if(num.length > 1)
            arr[1] = num[1];

        return arr;
    }


    public boolean unlucky1(int[] num)
    {
        int lastP = num.length-1;
        if(lastP  >= 2)
        {
            if((num[0] == 1 && num[1] == 3) || (num[1] == 1 && num[2] == 3))
                return true;
            return (num[lastP-1] == 1 && num[lastP] == 3);
        }
        if(lastP  == 1)
            return ((num[0] == 1 && num[1] == 3) || (num[1] == 1 && num[2] == 3));
        return false;
    }


    public int[] make2(int[] a, int[] b)
    {
        int[] comb = new int[2];
        if(a.length >= 2)
        {
            comb[0] = a[0];
            comb[1] = a[1];
        }
        else if(a.length == 1)
        {
            comb[0] = a[0];
            comb[1] = b[0];
        }
        else
        {
            comb[0] = b[0];
            comb[1] = b[1];
        }
        return comb;
    }


    public int[] front11(int[] a, int[] b)
    {
        int[] front;
        if(a.length >= 1)
        {
            if(b.length >= 1)
            {
                front = new int[2];
                front[0] = a[0];
                front[1] = b[0];
            }
            else
            {
                front = new int[1];
                front[0] = a[0];
            }
        }
        else if(b.length >= 1)
        {
            front = new int[1];
            front[0] = b[0];
        }
        else
            front = new int[0];
        return front;
    }

}
