package m2d22;
/**
 * java�����е�������һ�������������ͣ��丸����Object
 *
 * �����п��Դ�Ż����������ͣ�Ҳ�ɴ��������������
 *
 * ������󣨼������飩�洢�ڶ��У�����桰java����ʱ��������ã��ڴ��ַ��,����ֱ�Ӵ洢java����
 *
 * ����һ����������java�й涨���Ȳ��ɱ�
 *
 * ������� һά���� ��ά���� ��ά���� ��ά����
 * �������ݶ�����length���ԣ�java�Դ�����������ȡ����Ԫ�ظ���
 *
 * java������Ҫ������Ԫ������ͳһ��
 *
 * �����е�Ԫ�����ַ�������ġ����е����鶼���õ�һ��Ԫ�ص��ڴ��ַ��Ϊ��������ĵ�ַ
 *
 * �ŵ㣺��ѯ/����/����ĳ���±��Ԫ��Ч����ߣ�1.�ڴ����� 2.ÿһԪ��������ͬ����Сһ�� 3.֪�������ַ��֪���±꣬���������Ԫ�ص�ַ��
 *
 * ȱ�㣺Ϊ�˱�֤������Ԫ�ص�ַ�������������������ɾԪ��ʱЧ�ʵͣ���Ϊ�����ɾ��Ӱ�����Ԫ��ͳһ��ǰ/���ƶ�
 *      ���鲻�ܴ洢������������Ϊ���ڴ�����ҵ�һ����ڴ������Ŀռ�
 *
 * ���������һ��Ԫ�ص���ɾû��Ӱ��
 *
 * �﷨��ʽ  int[] arr1;
 *         boolean[] arr2;
 *         String[] arr3;
 *         Object[] arr4;
 * ��ʼ�����飺��̬��ʼ�� int[] arr1={100,200,300}
 *           ��̬��ʼ�� int[] arr1=new int[5];5��Ԫ�أ�Ԫ��Ĭ��ֵΪ0
 */
public class Test2 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        System.out.println(arr1[0]);
        System.out.println(arr1[arr1.length-1]);

        arr1[0]=111;
        arr1[5]=0;

        for(int i=0;i< arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }

        printArray(arr1);
        printArray(new int[]{1,2,3,4});

        printArray(new int[8]);


    }
    public static void printArray(int[] array){
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}