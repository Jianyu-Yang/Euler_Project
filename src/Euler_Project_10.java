/**PROBLEM 10
 * �����ĺ�
 * ����С��10�������ĺ���2 + 3 + 5 + 7 = 17��
 * ������С��������������ĺ͡�

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
		System.out.println("����С��������������ĺ�Ϊ��"+plus);
		long endtime=System.currentTimeMillis();
		System.out.println("��������ʱ��Ϊ��"+(endtime-starttime));
		// XXX �Զ����ɵķ������

	}

}
