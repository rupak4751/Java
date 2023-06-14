package question;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Ball ball = new Ball("ball");
		
		
		System.out.println("It is a " + ball.getBrandName());
		
		Baseball bball = new Baseball("BaseBall");
		
		System.out.println("It is a " + bball.getBrandName());
		
       Football fball = new Football("FootBall");
		
		System.out.println("It is a " + fball.getBrandName());

	}

}
