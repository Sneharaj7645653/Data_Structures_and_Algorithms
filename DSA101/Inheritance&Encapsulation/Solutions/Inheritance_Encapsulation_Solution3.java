class ComplexNumber {

    float real, imaginary;

    // Define constructor here
    ComplexNumber(float real, float imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }

    ComplexNumber add(ComplexNumber x){
        // Complete the function
        float r=this.real+x.real;
        float i=this.imaginary+x.imaginary;
        ComplexNumber c=new ComplexNumber(r,i);
        return c;

    }

    ComplexNumber subtract(ComplexNumber x){
        // Complete the function
        float r=this.real-x.real;
        float i=this.imaginary-x.imaginary;
        ComplexNumber c=new ComplexNumber(r,i);
        return c;

    }

    ComplexNumber multiply(ComplexNumber x){
        // Complete the function
        float r=this.real*x.real-this.imaginary*x.imaginary;
        float i=this.imaginary*x.real+x.imaginary*this.real;
        ComplexNumber c=new ComplexNumber(r,i);
        return c;
    }

    ComplexNumber divide(ComplexNumber x){
        // Complete the function
        float r=(this.real*x.real+this.imaginary*x.imaginary)/(x.real*x.real + x.imaginary*x.imaginary);
        float i=(this.imaginary*x.real-this.real*x.imaginary)/(x.real*x.real + x.imaginary*x.imaginary);
        ComplexNumber c=new ComplexNumber(r,i);
        return c;
    }
}

/*
    ComplexNumber a = new ComplexNumber(10, 5)
	ComplexNumber b = new ComplexNumber(2, 3)
	ComplexNumber c1 = a.add(b) 
	ComplexNumber c2 = a.subtract(b)
	ComplexNumber c3 = a.multiply(b)
	ComplexNumber c4 = a.divide(b)
*/