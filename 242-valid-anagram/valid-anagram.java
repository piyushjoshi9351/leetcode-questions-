
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        if (a.length != b.length) {
            return false;
        }

        java.util.Arrays.sort(a);
        java.util.Arrays.sort(b);

        return java.util.Arrays.equals(a, b);
    }
}
