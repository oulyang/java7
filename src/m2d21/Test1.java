package m2d21;
/**
 * �����ڲ��ࣨ��û�����������ֲ�������һ��
 * 
 * �ڲ��ࣺ������ڲ��ֶ���һ���µ���
 * ��Ϊ����̬�ڲ��ࣨ�����ھ�̬������
 * 		 ʵ���ڲ��ࣨ������ʵ��������
 * 		 �ֲ��ڲ��ࣨ�����ھֲ�������
 * 
 * �ɶ��Բ�����Բ� �ܲ��þ�������
 * @author yyds
 *
 */
public class Test1 {

	//��̬�ڲ���
	static class Tes1{
	}
	//ʵ���ڲ���
	class Tes2{
	}
	public void doother() {
		class Tes3{
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //�ֲ��ڲ���
		Math m1=new Math();
		//����д��ʾ�����������MyMathImp
		m1.mysum(new MyMathImp(), 10, 20);
		 
		
		/*m1.mysum(new MyMath() {},x,y);
		m1.mysum(new MyMath() {
			public int sum(int x,int y) {
			return x+y;}
		}, 10, 10);
		*/
		
	}
}


