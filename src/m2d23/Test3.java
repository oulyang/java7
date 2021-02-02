package m2d23;

public class Test3 {
    public static void main(String[] args) {
        Animal a1=new Animal();
        Animal a2=new Animal();
        Animal[] animals=new Animal[2];
        animals[0]=a1;
        animals[1]=a2;

        for(int i=0;i<animals.length;i++){
           // Animal a=animals[i];
            //a.move();
            animals[i].move();
        }

        Animal[] ans=new Animal[2];
        ans[0]=new Animal();
        ans[1]=new Cat();

    }
}
