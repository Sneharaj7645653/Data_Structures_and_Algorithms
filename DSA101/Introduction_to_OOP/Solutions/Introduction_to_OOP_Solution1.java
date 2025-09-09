class Circle{
    // Define properties here
    int radius;

    // Define constructor here
    Circle(int radius)
    {
        this.radius=radius;
    }

    float perimeter(){
        // Complete the function
        return 2*3.14f*this.radius;

    }

    float area(){
        // Complete the function
        return 3.14f*this.radius*this.radius;

    }
}

/*
    Circle a = new Circle(3)  // Radius = 3
	a.perimeter() // 18.84
    a.area() // 28.26
*/