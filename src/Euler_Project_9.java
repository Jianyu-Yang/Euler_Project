/**problem 9
 * ����ϴ����˹��Ԫ��
�ϴ����˹��Ԫ����������Ȼ��a < b < c��ɵļ��ϣ�������
a2 + b2 = c2
���磬32 + 42 = 9 + 16 = 25 = 52��
����ֻ��һ���ϴ����˹��Ԫ������ a + b + c = 1000���������Ԫ��ĳ˻�abc��
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
		System.out.printf("�˻�Ϊ��%d\n", (a*b*c));
		long endtime=System.currentTimeMillis();
		System.out.println("��������ʱ��Ϊ��"+(endtime-starttime));
		// XXX �Զ����ɵķ������

	}

}
