public class leetcodeQ2 {
        //You are given an m x n integer grid accounts where accounts[i][j]
        //is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. 
        //Return the wealth that the richest customer has.
        //A customer's wealth is the amount of money they have in all their bank accounts.
        //The richest customer is the customer that has the maximum wealth.
    public static void main(String[] args) {
        int[][] accounts={
            {1,2,3},
            {3,2,1}
        };
        int ans=maximumWealth(accounts);
        System.out.println(ans);
    }
    public static int maximumWealth(int[][] accounts){
        int ans=Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum=0;
            for (int banks = 0; banks < accounts[person].length; banks++) {
                
                sum=sum+accounts[person][banks];
            }
            if (sum>ans) {
                ans=sum;
            }
            
        }
        return ans;
    }
}
