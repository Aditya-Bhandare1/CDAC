class Box{
private double height,width,breadth;

Box(double height, double width,double breadth){

this.height=height;
this.width=width;
this.breadth=breadth;


}
double  getVolume() {

return breadth*width*height;

}

double getArea() {
return  (2*breadth*width + 2*width*height + 2*breadth*height);

} 




public static void main(String[] args) {


Box b1=new Box(10.0,20.1,30.1);
Box b2=new Box(11.11,12.14,12.88);
System.out.println("getVolume: "+b1.getVolume()+"getArea"+b1.getArea());
System.out.println("getVolume: "+b2.getVolume()+"getArea"+b2.getArea());




}


}