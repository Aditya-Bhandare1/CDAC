class Room{
private double height,width,breadth;


Room(double height, double width, double breadth ){

this.height=height;
this.width=width;
this.breadth=breadth;



}

double volume(){
double volume;
volume=height*width*breadth;

return volume;



}




}

class RoomDemo{
public static void main(String args[])
{
double volume;

Room r=new Room(10.1,20.1,30.1);

volume=r.volume();
System.out.println(volume);

}


}