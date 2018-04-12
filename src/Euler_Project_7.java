/**第10001个素数
 * 列出前6个素数，它们分别是2、3、5、7、11和13。我们可以看出，第6个素数是13。
 * 第10,001个素数是多少？
 * 
 */

/**
 * @author yjy84
 * Date:2018-04-11
 */
public class Euler_Project_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i=2;
		Label1:for (int num=0;num<10001;i++) {
			for(int j=2;j<i;j++) {			//判断i是否为质数
				if (i%j==0) {
					continue Label1;
				}
			}
			num++;		//计已找到的质数的数量
		}
	System.out.println("第10,001个素数是:"+(i-1));		//输出第10001个质数

	}

}
