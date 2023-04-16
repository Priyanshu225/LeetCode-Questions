class Solution {
    public int majorityElement(int[] arr) {
        int index_of_maj_ele=0;
        int count =1;
        for(int i =1;i<arr.length;i++){
            if(arr[i]==arr[index_of_maj_ele]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                index_of_maj_ele=i;
                count=1;
            }
        }
        return arr[index_of_maj_ele];
    }
}