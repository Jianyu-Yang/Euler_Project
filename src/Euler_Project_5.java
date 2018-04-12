/**最小倍数
 * 2520是最小的能够被1到10整除的数。
 * 最小的能够被1到20整除的正数是多少？
 */

/**
 * @author yjy84
 * Date:2018-04-10
 */
public class Euler_Project_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int k=0;		//是否找到的标志数
		Lable1:for (int num=21;k==0;num++) {
					for (int i=2;i<=20;i++) {		//判断num是否能被1-20整除
						if (num%i!=0) {
							continue Lable1;
						}	
					}
					System.out.println("最小的能够被1到20整除的正数是："+num);		//输出num
					k=1;		//改变标志数
		}

	}

}
