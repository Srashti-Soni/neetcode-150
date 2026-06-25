class Solution {
    public String longestCommonPrefix(String[] strs) {
        String st=strs[0];
            int max =-1;
            int len=st.length();
            int k=0;
        for(int i=0;i<len;i++){
            char ch=st.charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i==strs[j].length() || ch!=strs[j].charAt(i)){
                    return st.substring(0,i);
                }
        
        }
        
    }
    return st;
}
}