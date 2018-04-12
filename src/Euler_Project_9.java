/**problem 9
 * 特殊毕达哥拉斯三元组
毕达哥拉斯三元组是三个自然数a < b < c组成的集合，并满足
a2 + b2 = c2
例如，32 + 42 = 9 + 16 = 25 = 52。
有且只有一个毕达哥拉斯三元组满足 a + b + c = 1000。求这个三元组的乘积abc。
 * 
 */

/**
 * @author yjy84
 * Data:2018-04-11
 */
public class Euler_Project_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long starttime=System.currentTimeMillis();
		int a=1;
		int b=1;
		int c=1;
		Lable1:for (a=1;a<1000;a++) {
					for (b=1;b<1000;b++) {
						for (c=1;c<1000;c++) {
							if ((a+b+c==1000)&&(a<b)&&(b<c)&&(a*a+b*b==c*c)) {
								break Lable1;
							}
						}
					}
				}
		System.out.printf("乘积为：%d\n", (a*b*c));
		long endtime=System.currentTimeMillis();
		System.out.println("程序运行时间为："+(endtime-starttime));
		// XXX 自动生成的方法存根

	}

}
