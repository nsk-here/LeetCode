class Solution {
    public boolean uniqueOccurrences(int[] arr) 
    {
      // Count no. of value in map along with value
      Map<Integer, Integer> freq = new HashMap<>();
      for(int val : arr)
        freq.put(val,freq.getOrDefault(val,0)+1);
      
      Set<Integer> map = new HashSet<>();
      
      
      for(Map.Entry<Integer,Integer> mapEnt : freq.entrySet() )
      {
        int val = mapEnt.getValue();
          
        // check it if it has repeating value than set will return false    
        if(map.contains(val))
           return false;
        map.add(val);
      }
        
      return true;
    }
}
