/*
 * problem 3:
 * ���������
 * 13195������������Ϊ5��7��13��29��
 * 600851475143�����������Ƕ��٣� 
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
			if (num%i==0) {			//�ж��Ƿ�Ϊnum������
				for(long j=2L;j<i;j++) {		//�ж�i�Ƿ�Ϊ����
					if (i%j==0) {
						break Tabel1;
					}
				}
				zhiyinshu=i;		//��¼������
			}
		}
		System.out.println("���������="+zhiyinshu);		//���num�����������

	}

}
