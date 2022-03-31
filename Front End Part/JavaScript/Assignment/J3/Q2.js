class Rectangle { 
    constructor(width,height){
      this.width=width;
      this.height=height;
    }
    
  getArea(){
    console.log(this.width*this.height);
  }
}
  var r1 = new Rectangle(8,8)
  r1.getArea()
  var r1 = new Rectangle(4,4)
  r1.getArea()