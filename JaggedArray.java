public class JaggedArray{

    public static void main(String a[]){
        int nums[][] = new int[5][]; //jagged arrays
        nums[0] = new int[4];
        nums[1] = new int[3];
        nums[2] = new int[4];
        nums[3] = new int[3];
        nums[4] = new int[4];

        int[][] nums1 = new int[3][];
        nums1[0] = new int[3];
        nums1[1] = new int[2];
        nums1[2] = new int[3];

        for(int n[] : nums){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

        for(int n[] : nums1){
            for (int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums1[i].length; j++){
                int random = (int)(Math.random()*100);
                nums1[i][j] = random;
                System.out.print(nums1[i][j] + " ");
            }
            System.out.println();
        }

        //3d array - technically can be any array dimensions u want
        int[][][] nums3d = new int[4][3][4];
        //if want to handle, will use very nested loops
    }    
}