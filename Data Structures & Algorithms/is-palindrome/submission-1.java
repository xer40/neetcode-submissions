class Solution {
    public boolean isPalindrome(String s) {
        String noSpace = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(noSpace);
        for(int i = 0, j=noSpace.length()-1; i < noSpace.length(); i++, j--) {
            if(noSpace.charAt(i) != noSpace.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
