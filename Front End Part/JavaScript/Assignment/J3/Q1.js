class Rectangle { 
    constructor(width,height){
      this.width=width;
      this.height=height;
    }
    getwidth(){
       console.log('The width is : '+this.width);
   }
   getheight(){
      console.log('The height is : '+this.height);
   }
  }
  var r1 = new Rectangle(8,8)
  r1.getwidth();
  r1.getheight();
  var r1 = new Rectangle(4,4)
  r1.getwidth();
  r1.getheight(); 