class Rectangle {
    // Define properties here
    int l;
    int b;

    // Define constructor here
    Rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }

    int perimeter(){
        // Complete the function
        return 2*(this.l+this.b);

    }

    int area(){
        // Complete the function
        return this.l*this.b;

    }
}

/*
    Rectangle a = new Rectangle(2, 3)  // Length = 2, Breadth = 3
	a.perimeter() // Should give 10
    a.area() // Should give 6
*/