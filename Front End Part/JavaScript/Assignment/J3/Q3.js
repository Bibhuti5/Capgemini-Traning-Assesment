class rectangle{
    constructor(width, height) {
        this.width = width;
        this.height = height;
    }
    getArea()
    {
      console.log(this.width*this.height);
    }
    
    }
    const shape = new rectangle(12,12);
    console.log(shape.width)
    console.log(shape.height)
    shape.height=11;
    console.log(shape.height)
    shape.getArea()
