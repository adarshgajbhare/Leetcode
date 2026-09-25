class Solution {
    public int lengthOfLastWord(String s) {
        
      String[] ch = s.split(" ");

String last = ch[ch.length - 1];

return last.length();

    }
}