class Fraction {
    int numerator, denominator;

    // Define constructor here
    Fraction(int numerator, int denominator)
    {
        this.numerator=numerator;
        this.denominator=denominator;
    }

    Fraction add(Fraction a){
        // Complete the function
        int n=this.numerator*a.denominator + this.denominator*a.numerator;
        int d=this.denominator*a.denominator;
        int divisor=gcd(Math.abs(n),Math.abs(d));
        n=n/divisor;
        d=d/divisor;

        Fraction sum=new Fraction(n,d);
        return sum;

    }

    Fraction subtract(Fraction a){
        // Complete the function
        int n=this.numerator*a.denominator - this.denominator*a.numerator;
        int d=this.denominator*a.denominator;
        int divisor=gcd(Math.abs(n),Math.abs(d));
        n=n/divisor;
        d=d/divisor;
        Fraction diff=new Fraction(n,d);
        return diff;

    }

    Fraction multiply(Fraction a){
        // Complete the function
        int n=this.numerator*a.numerator;
        int d=this.denominator*a.denominator;
        int divisor=gcd(Math.abs(n),Math.abs(d));
        n=n/divisor;
        d=d/divisor;
        Fraction product=new Fraction(n,d);
        return product;

    }
    int gcd(int a,int b)
    {
        int ans=0;
        int d=1;
        while(d<=a && d<=b)
        {
            if(a%d==0 && b%d==0)
            {
                ans=d;
            }
            d++;
        }
        return ans;
    }
}

/*
    Fraction x = new Fraction(2, 3)  // 2/3
	Fraction y = new Fraction(4, 5) // 4/5
    Fraction z = x.add(y) // 22/15
    Fraction z = x.subtract(y) // -2/15
    Fraction z = x.multiply(y) // 8/15
*/