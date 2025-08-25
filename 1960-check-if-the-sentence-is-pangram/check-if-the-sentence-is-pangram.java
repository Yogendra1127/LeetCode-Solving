class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean allString = true;

        for(char ch = 'a' ; ch<='z' ; ch++){
            if(!sentence.contains(String.valueOf(ch))){
                allString = false;
                break;
            }
        }
        if(allString){
            return true;
        }
        else{
            return false;
        }
    }
}