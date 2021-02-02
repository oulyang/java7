package m2d24;

public class Test4 {
    public static void main(String[] args) {
        //数组扩容：先建一个大的数组，将原数组内容拷贝到大数组中。尽可能不要使用数组拷贝
        //System.arraycopy(5个参数);
        int[] src={1,2,3,4,5};
        int[] dest=new int[20];
        System.arraycopy(src,1, dest,3,2);

        for(int i=0;i<dest.length;i++){
            System.out.println(dest[i]);
        }
    }
}
