public class Array1 {
    

    
    public static void main(String a[]){

        int num1[] = {5,6,7};
        int num2[] = new int[3]; // by default, values are zero

        for(int x=0; x < num1.length; x++){
            System.out.println(num2[x]);
        }

        num2[0]=1;
        num2[1]=2;
        num2[2]=3;

        int nums3[][] = new int[5][5];

        System.out.println(num1);
        System.out.println(num1[0]);
        
        System.out.println(num2);
        System.out.println(num2[1]);

        for (int i=0;i<nums3.length;i++){
            for (int j=0; j<nums3[0].length; j++){

                int random = (int)(Math.random() * 100); // need the bracket if not type casting will run first on the decimal that rounds down to zero - precedence is parenthesis
                nums3[i][j] = random;
                System.out.print(nums3[i][j] + " ");
            }
            System.out.println();
        }
        // row traversal
    }

}
