/**平方的和与和的平方之差
 * 前十个自然数的平方的和是
 * 12 + 22 + … + 102 = 385
 * 前十个自然数的和的平方是
 * (1 + 2 + … + 10)2 = 552 = 3025
 * 因此前十个自然数的平方的和与和的平方之差是 3025 − 385 = 2640。
 * 求前一百个自然数的平方的和与和的平方之差。
 * 
 */

/**
 * @author yjy84
 * Date:2018-04-11
 */
public class Euler_Project_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sqrt=0;
		int plus=0;
		int minus=0;
		for (int i=1;i<=100;i++) {
			sqrt+=i*i;
			plus+=i;
		}
		plus=plus*plus;
		minus=plus-sqrt;
		System.out.println("前一百个自然数的平方的和与和的平方之差为："+minus);

	}

}
