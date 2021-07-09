class GfG
{
    int maxLen(int arr[], int n)
    {
    int sum=0;
        int maxRange=0;
        int diff=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if(sum==0){
                maxRange = i+1;
            }
            else{
                if(map.get(sum)!= null){
                    maxRange = Math.max(maxRange, i-map.get(sum));
                }
                else{
                    map.put(sum,i);
                }
            }
        }
            return(maxRange);
    }
}
