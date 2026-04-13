class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map= new HashMap<>();
       int count=0;
        int left=0;
        int maxfre=0;
        for(int r=0;r<s.length();r++){
          char ch=s.charAt(r);
             map.put(ch,map.getOrDefault(ch,0)+1);
             if(map.get(ch)>maxfre){
                maxfre=map.get(ch);
             }
             if((r-left+1)-maxfre <=k){
                count++;
             }
             else if ((r-left+1)-maxfre > k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
             }
        }
        return count;
    }
}
