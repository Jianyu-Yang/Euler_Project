/**��10001������
 * �г�ǰ6�����������Ƿֱ���2��3��5��7��11��13�����ǿ��Կ�������6��������13��
 * ��10,001�������Ƕ��٣�
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
			for(int j=2;j<i;j++) {			//�ж�i�Ƿ�Ϊ����
				if (i%j==0) {
					continue Label1;
				}
			}
			num++;		//�����ҵ�������������
		}
	System.out.println("��10,001��������:"+(i-1));		//�����10001������

	}

}
