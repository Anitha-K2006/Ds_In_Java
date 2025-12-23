class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer>set=new HashSet<>();
            for(int x:nums1){
                set.add(x);
            }
            Set<Integer>res=new HashSet<>();
            for(int y:nums2){
                if(set.contains(y)){
                    res.add(y);
                }
            }
            int result[]=new int[res.size()];
            int i=0;
            for(int val:res){
                result[i]=val;
                i++;
            }
            return result;
    }
}
