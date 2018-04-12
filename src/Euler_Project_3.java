/*
 * problem 3:
 * 最大质因数
 * 13195的所有质因数为5、7、13和29。
 * 600851475143最大的质因数是多少？ 
*/

/**
 * @author yjy84
 * Date:2018-04-10
 */

public class Euler_Project_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long zhiyinshu=0L;
		Tabel1:for (long i=3L,num=600851475143L;i<num;i++) {
			if (num%i==0) {			//判断是否为num的因数
				for(long j=2L;j<i;j++) {		//判断i是否为质数
					if (i%j==0) {
						break Tabel1;
					}
				}
				zhiyinshu=i;		//记录质因数
			}
		}
		System.out.println("最大质因数="+zhiyinshu);		//输出num的最大质因数

	}

}
