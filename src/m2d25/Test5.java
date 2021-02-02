package m2d25;

public class Test5 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4},{5,6,7,8}};

        int[] a0=arr[0];
/*        for(int i=0;i<arr[0].length;i++)
        {
            System.out.println(arr[0][i]);
        }*/
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}

