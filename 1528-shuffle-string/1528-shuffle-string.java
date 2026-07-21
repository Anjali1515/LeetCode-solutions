class Solution {
    public String restoreString(String s, int[] indices) {
        char letters[]=new char[s.length()];
        for(int i=0;i<letters.length;i++){
            letters[indices[i]]=s.charAt(i);
        }
        return new String(letters);
    }
}