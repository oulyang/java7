package m2d22;

public class Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        if(args.length!=2){
            System.out.println("�������û��������룺 ,���磺wanggang 123");
            return;
        }

        String username=args[0];
        String password=args[1];
        if("zhang".equals(username)&&"122".equals(password)){
            System.out.println("success");
        }else{
            System.out.println("default");
        }
	}

}
