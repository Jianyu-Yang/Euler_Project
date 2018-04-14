/**
 * 
 */

/**
 * @author yjy84
 *
 */
public class Euler_Project_21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num=0;
		int d=0;
		int D[]=new int[10000];
		D[0]=0;
		D[1]=0;
		for (int n=2;n<10000;n++) {
			for (int j=1;j<n;j++) {
				if (n%j==0) {
					d+=j;
				}
			}
			D[n]=d;
			d=0;
		}
		for (int n=2;n<10000;n++) {
			for (int j=3;j<10000;j++) {
				if ((D[n]!=0)&&(n!=j)&&(D[n]==j)&&(D[j]==n)) {
					num+=n+j;
					D[n]=0;
					D[j]=0;
				}
			}
		}
		System.out.println("="+num);
		// TODO 自动生成的方法存根

	}

}
