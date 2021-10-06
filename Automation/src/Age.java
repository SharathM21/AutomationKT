

public class Age {

	public static void main(String[] args) {
		java.util.Scanner Obj = new java.util.Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the age");
        int age = Obj.nextInt();
        if (age >= 18) {
        	System.out.println("Age is greater than 18");
        	        }
        else {
        System.out.println("Age is lesser than 18");
        }
        
        System.out.println(age);
	}

}
