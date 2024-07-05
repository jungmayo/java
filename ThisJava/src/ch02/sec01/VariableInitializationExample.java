package ch02.sec01;

public class VariableInitializationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int hour = 3;
    int minute = 5;
    System.out.println(hour + "시간" + minute + "분");
    
    int totalMinute = (hour*60) + minute;
    System.out.println("총" + totalMinute + "분");
    
    int x = 3;
    int y = 5;
    System.out.println("x:" + x +  " y:" + y);
    
    int temp = x;
    x = y;
    y = temp;
    System.out.println("x: " + x + ", y:" + y);
    
    
    int var1 = 0b1011; //2진수
    int var2 = 0206; // 8진수
    int var3 = 365; //10진수
    int var4 = 0XB3; //16진수
    
    System.out.println("var1:" + var1);
    System.out.println("var2:" + var2);
    System.out.println("var3:" + var3);
    System.out.println("var4:" + var4);
    
    long var20 = 10;
    long var21 = 20L;
   
    		
    System.out.println(var20);
    System.out.println(var21);}
	
}
	// 문자타입
	
