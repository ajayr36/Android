

import java.util.Scanner;



public class rectangle {

	 private int width;
	 private int height;

	public int getwidth(){
		return width;
	}
	public void setwidth(int w){
		  width = w;	
	}
	public int getheight(){
		return height;
	}
	public void setheight (int h){
		height = h;
	}
	public void getData (){
		Scanner  a = new Scanner( System .in);
		System .out .println ("Enter width ");
		width= a.nextInt();
		System .out .println ("Enter height ");
		height = a.nextInt();
	}
	public void ShowData(){
		System .out .println ("Enter width "+ 'w');
		System .out .println ("Enter height "+'h');

	}
	public int getArea(){
		return width*height;
	} 
	public int getperimeter(){
		
		return 2*(width+height);
	}
	public static void main(String[] args) {
	Rectangle r = new Rectangle();
	  r.getData();
	 r.showData ();
	
	System.println("Area"+  r.getArea());

	}

}
