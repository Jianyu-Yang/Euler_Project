/**�߶ȿ�Լ����������
 * ��������������ͨ�����������Ȼ�������ɵġ�
 * ���磬��7������������ 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28��
 * �����������е�ǰʮ��ֱ��ǣ�
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ��
 * �������оٳ�ǰ�߸���������������Լ����

 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
���ǿ��Կ�����28�ǵ�һ��ӵ�г���5��Լ��������������

��һ��ӵ�г���500��Լ�������������Ƕ��٣�
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
		System.out.println("��һ��ӵ�г���500��Լ�������������ǣ�"+delta);
		long endtime=System.currentTimeMillis();
		System.out.println("��������ʱ��="+(endtime-starttime));
		// XXX �㷨ִ��ʱ�������Լ90���ӣ��㷨���Ľ���

	}

}
