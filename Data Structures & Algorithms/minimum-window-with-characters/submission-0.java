class Solution {
    public String minWindow(String s, String t) {
        int[] freq=new int[128];
        for(int i=0;i<t.length();i++){
            char ch= t.charAt(i);
            freq[ch]++;
           
        }
            String st="";
            if(t.length()>s.length()) return st;
        int left=0;
       int min = Integer.MAX_VALUE;
        int rem=t.length();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch]--;
            if(freq[ch]>=0){
                  rem--;
            }
              while(rem == 0){
                char c = s.charAt(left);
                if(i - left + 1 < min){
                    min = i - left + 1;
                    st = s.substring(left, i+1);
                }
                freq[c]++;
                if(freq[c] > 0){
                    rem++;
                }

                left++;
            }

                    }
                    return st;
    }
}
