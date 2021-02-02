package m2d22;
/**
 * java语言中的数组是一种引用数据类型，其父类是Object
 *
 * 数组中可以存放基本数据类型，也可存放引用数据类型
 *
 * 数组对象（即该数组）存储在堆中，数组存“java对象”时存的是引用（内存地址）,不能直接存储java对象。
 *
 * 数组一旦创建，在java中规定长度不可变
 *
 * 数组分类 一维数组 二维数组 三维数组 多维数组
 * 所有数据对象都有length属性（java自带），用来获取数组元素个数
 *
 * java中数组要求数组元素类型统一。
 *
 * 数组中的元素其地址是连续的。所有的数组都是拿第一个元素的内存地址作为整个数组的地址
 *
 * 优点：查询/查找/检索某个下标的元素效率最高（1.内存连续 2.每一元素类型相同，大小一样 3.知道数组地址，知道下标，可以算出该元素地址）
 *
 * 缺点：为了保证数组中元素地址连续，在数组上随机增删元素时效率低，因为随机增删会影响后面元素统一向前/后移动
 *      数组不能存储大数据量，因为在内存很难找到一大块内存连续的空间
 *
 * 对数组最后一个元素的增删没有影响
 *
 * 语法格式  int[] arr1;
 *         boolean[] arr2;
 *         String[] arr3;
 *         Object[] arr4;
 * 初始化数组：静态初始化 int[] arr1={100,200,300}
 *           动态初始化 int[] arr1=new int[5];5个元素，元素默认值为0
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