class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] freq1=new int[26];
        for(int i=0;i<s1.length();i++){
            char ch= s1.charAt(i);
            freq1[ch - 'a']++;
        }
            int[] freq2= new int[26];
            for(int j=0;j<s1.length();j++){
            char ch=s2.charAt(j);
            freq2[ch - 'a']++;
               }
           if(Arrays.equals(freq1,freq2)) return true;

        for(int i=s1.length();i<s2.length();i++){
            char ch1 =  s2.charAt(i-s1.length());
            char ch2 =  s2.charAt(i);
             freq2[ch1 -'a']--;
             freq2[ch2 -'a']++;
             if(Arrays.equals(freq1,freq2)) return true;
    }
    return false;
}
}
