class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr= new int[2];
        int i=0;
        int j=numbers.length-1;
        while(i<j){
            while(i<j && numbers[i]==numbers[i+1]){
                i++;
            }
            while(i<j && numbers[j]==numbers[j-1]){
                j--;
            }
            if(numbers[i]+numbers[j]==target){
                arr[0]=i+1;
                arr[1]=j+1;
               break;
            }
            else if(target < numbers[i]+numbers[j]){
                j--;
            }
            else {
                i++;
            }
           
        }
        return arr;
    }
}
