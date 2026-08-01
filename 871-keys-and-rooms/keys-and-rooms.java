class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] v = new boolean[rooms.size()];

        dfs(0,rooms,v);
        for(boolean i:v){
            if(!i) return false;
        }
        return true;
    }

    void dfs(int room, List<List<Integer>> rooms, boolean v[]){
        v[room] = true;

        for(int i: rooms.get(room)){
            if(v[i] == false){
                dfs(i, rooms, v);
            }
        }
    }
}