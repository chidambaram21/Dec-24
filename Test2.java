package chintu24;

public class Test2 {

	public static void main(String[] args) {
    
		int num= 8179,r;int sum = 0;
		// 9+9+9+9----36---3+6---9
		
		while(num !=0) {
			r= num%10;//
			num=num/10;
			sum=sum+r;
		if	(num==0){
			if (sum>=10) {
				num=sum;
				sum=0;
			}
		}
			
			
		}
		System.out.println("sum---->"+sum);
	}
}
   

		