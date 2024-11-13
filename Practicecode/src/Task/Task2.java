package Task;

public class Task2 {

	public static void main(String[] args) {
		int num=77;
		while(num>=10) {
			int sum=0;
			while(num>0) {
				sum+=num%10;
				num/=10;
			}
			num=sum;
		}
		System.out.println("the result"+num);
			}
		}

