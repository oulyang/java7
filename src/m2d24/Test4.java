package m2d24;

public class Test4 {
    public static void main(String[] args) {
        //�������ݣ��Ƚ�һ��������飬��ԭ�������ݿ������������С������ܲ�Ҫʹ�����鿽��
        //System.arraycopy(5������);
        int[] src={1,2,3,4,5};
        int[] dest=new int[20];
        System.arraycopy(src,1, dest,3,2);

        for(int i=0;i<dest.length;i++){
            System.out.println(dest[i]);
        }
    }
}
