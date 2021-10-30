public class leetcodeQ1 {

    // Given an array nums of integers, return how many of them contain an even number of digits.
    public static void main(String[] args) {
        int[] nums ={12,345,2,6,7896,23,56,-34,-56632};
        System.out.println(findnumsbers(nums));
    }
    public static int findnumsbers(int[] nums) {
        
        int t=0;
        for(int i= 0;i<nums.length;i++){
            int r=0;
            if (nums[i]<0) {
                nums[i]=nums[i]*-1;

                while (nums[i]>0) {
                    nums[i]=nums[i]/10;
                    r++;
                }
                if (r%2==0) {
                    t++;
                }
            } else {
                while (nums[i]>0) {
                    nums[i]=nums[i]/10;
                    r++;
                }
                if (r%2==0) {
                    t++;
                }
            }
            
        }
        return t;
    }    
}
