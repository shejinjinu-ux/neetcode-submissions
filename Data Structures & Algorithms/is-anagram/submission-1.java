class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Integer>st=new HashMap<>();
        HashMap<Character,Integer>tt=new HashMap<>();
        for(char c:s.toCharArray())
        {
           st.put(c,st.getOrDefault(c,0)+1);
        }
         for(char c:t.toCharArray())
        {
           tt.put(c,tt.getOrDefault(c,0)+1);
        }
        if(st.equals(tt))
        {
            return true ;

        }
        else 
        return false;


    }
}
