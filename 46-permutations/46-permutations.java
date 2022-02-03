class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();
        boolean[] visited= new boolean[nums.length];
        LinkedList<Integer> curr= new LinkedList<>();
        permutations(ans,nums,visited,curr);
        
        return ans;
        
    }
    
    public void permutations(List<List<Integer>> ans,int[] nums,boolean[] visited,LinkedList<Integer> curr){
        if(curr.size()==nums.length){
            ans.add(curr);
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                visited[i]=true;
                curr.addLast(nums[i]);
                permutations(ans,nums,visited,new LinkedList(curr));
                visited[i]=false;
                curr.removeLast();
            }
        }
    }
}