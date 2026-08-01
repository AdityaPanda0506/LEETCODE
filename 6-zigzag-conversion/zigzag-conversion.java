class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || s.length() < numRows){
            return s;
        }

        ArrayList<StringBuilder> st = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            st.add(new StringBuilder());
        }
        int idx = 0;
        int d = 1;
        for(char c: s.toCharArray()){
            st.get(idx).append(c);
            if(idx == 0){
                d = 1;

            }else if(idx == numRows -1){
                d = -1;
            }
            idx += d;
        }

        StringBuilder res = new StringBuilder();
        for(StringBuilder i : st){
                res.append(i);

        }

        return res.toString();
    }
}