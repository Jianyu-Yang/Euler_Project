/**��С����
 * 2520����С���ܹ���1��10����������
 * ��С���ܹ���1��20�����������Ƕ��٣�
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
		int k=0;		//�Ƿ��ҵ��ı�־��
		Lable1:for (int num=21;k==0;num++) {
					for (int i=2;i<=20;i++) {		//�ж�num�Ƿ��ܱ�1-20����
						if (num%i!=0) {
							continue Lable1;
						}	
					}
					System.out.println("��С���ܹ���1��20�����������ǣ�"+num);		//���num
					k=1;		//�ı��־��
		}

	}

}
