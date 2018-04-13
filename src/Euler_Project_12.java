/**高度可约的三角形数
 * 三角形数数列是通过逐个加上自然数来生成的。
 * 例如，第7个三角形数是 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28。
 * 三角形数数列的前十项分别是：
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, …
 * 让我们列举出前七个三角形数的所有约数：

 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
我们可以看出，28是第一个拥有超过5个约数的三角形数。

第一个拥有超过500个约数的三角形数是多少？
 * 
 */

/**
 * @author yjy84
 * Date:2018-04-13
 */
public class Euler_Project_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long starttime=System.currentTimeMillis();
		int num=0;
		long delta=0L;
		for (long i=1L;num<=500;i++) {
			delta+=i;
			num=0;
			for (long j=1L;j<=delta;j++) {
				if(delta%j==0) {
					num++;
				}
			}
			System.out.println(delta);
		}
		System.out.println("第一个拥有超过500个约数的三角形数是："+delta);
		long endtime=System.currentTimeMillis();
		System.out.println("程序运行时间="+(endtime-starttime));
		// XXX 算法执行时间过长，约90分钟，算法待改进。

	}

}
