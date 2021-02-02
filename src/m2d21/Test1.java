package m2d21;
/**
 * 匿名内部类（类没有类名），局部变量的一种
 * 
 * 内部类：在类的内部又定义一个新的类
 * 分为：静态内部类（类似于静态变量）
 * 		 实例内部类（类似于实例变量）
 * 		 局部内部类（类似于局部变量）
 * 
 * 可读性差，复用性差 能不用尽量不用
 * @author yyds
 *
 */
public class Test1 {

	//静态内部类
	static class Tes1{
	}
	//实例内部类
	class Tes2{
	}
	public void doother() {
		class Tes3{
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //局部内部类
		Math m1=new Math();
		//这样写表示这个类有类名MyMathImp
		m1.mysum(new MyMathImp(), 10, 20);
		 
		
		/*m1.mysum(new MyMath() {},x,y);
		m1.mysum(new MyMath() {
			public int sum(int x,int y) {
			return x+y;}
		}, 10, 10);
		*/
		
	}
}


