/**PROBLEM 10
 * 素数的和
 * 所有小于10的素数的和是2 + 3 + 5 + 7 = 17。
 * 求所有小于两百万的素数的和。

 */

/**
 * @author yjy84
 * Date:2018-04-11
 */
public class Euler_Project_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long starttime=System.currentTimeMillis();
		long plus=0L;
		Lable1:for (long i=2L;i<2000000;i++) {
					for (long j=2L;j<i;j++) {
						if (i%j==0) {
							continue Lable1;
						}
					}
					System.out.println("i="+i);
					plus+=i;
			}
		System.out.println("所有小于两百万的素数的和为："+plus);
		long endtime=System.currentTimeMillis();
		System.out.println("程序运行时间为："+(endtime-starttime));
		// XXX 自动生成的方法存根

	}

}
