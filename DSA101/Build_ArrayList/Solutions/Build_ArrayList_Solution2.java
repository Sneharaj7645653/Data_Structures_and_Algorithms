class MyFloat {
    // Define properties here
    int w;
    int f;

    // Define constructor here
    MyFloat(int a, int b)
    {
        w=a;
        f=b;
    }

    public MyFloat add(MyFloat other) {
        // Implement your addition logic here
        float f1 = w+0.1f*f;
        float f2 = other.w+0.1f*other.f;
        float ans = f1+f2;
        int whole=(int)ans;
        int fraction = (int)((ans*10)%10);
        MyFloat mat = new MyFloat(whole,fraction);
        return mat;
    }

    public void printMyFloat(){
        // Print the MyFloat in the mentioned format
        System.out.println(w+"."+f);
    }
}
/* 
MyFloat num1 = new MyFloat(1, 2);
MyFloat num2 = new MyFloat(3, 4);

MyFloat result = num1.add(num2);

System.out.println(result); // Output: 4.6
*/