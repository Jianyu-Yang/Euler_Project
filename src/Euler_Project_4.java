/**problem 4
 * �����ĳ˻�
 * ���������Ǵ�ǰ����ʹӺ���ǰ����һ��������
 * ������2λ����˵õ��������ĳ˻��� 9009 = 91 �� 99��
 * �ҳ�������3λ����˵õ��������ĳ˻���
 */

/**
 * @author yjy84
 * Date:
 */
public class Euler_Project_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int multi=0;
		int max=0;
		int m=0;
		int k=0;
		int[] num;
		for (int i=100;i<1000;i++) {
			Labal1:for (int j=100;j<=i;j++) {
				multi=i*j;
				for (m=0;multi!=0;m++) {
					multi/=10;
				}
				num=new int[m];
				for (k=0;k!=m;k++) {
					num[k]=multi%10;
					multi/=10;
				}
				for  (int x=0,y=m-1;x<=y;x++,y--) {
					if(num[x]!=num[y]) {
						continue Labal1;
					}
				}
				max=i*j;
				System.out.println("="+max);
			}
		}
		System.out.println("="+max);
		// FIXME ��������������ȷ�����ɳ����߼�����

	}

}
