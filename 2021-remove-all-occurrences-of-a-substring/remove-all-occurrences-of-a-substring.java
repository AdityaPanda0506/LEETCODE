class Solution {
    public String removeOccurrences(String s, String part) {
        int n = s.length();
        int k = s.indexOf(part);
        
        
        while(k != -1){
            s = s.substring(0,k) + s.substring(k + part.length());
            n = s.length();
            k = s.indexOf(part);

        }
        return s;
    }
}