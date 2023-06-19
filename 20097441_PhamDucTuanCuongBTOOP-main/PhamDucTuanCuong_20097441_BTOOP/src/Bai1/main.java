package Bai1;

public class main {
		    public static void main(String[] args) {	
		        Toado td = new  Toado (5,10);
		        int x =  td.getX();
		        int y =  td.getY();
		        System.out.println("Giá trị x: " + x);
		        System.out.println("Giá trị y: " + y);
		        td.setX(15);
		        td.setY(20);
		        x =  td.getX();
		        y =  td.getY();
		        System.out.println("Giá trị x sau khi thay đổi: " + x);
		        System.out.println("Giá trị y sau khi thay đổi: " + y);
		    }
		}




