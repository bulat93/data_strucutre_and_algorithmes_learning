package strings;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "loveleetcode";
        /*int index = firstUniqChar(s);
        System.out.println(index);*/
        int a = s.charAt(1) - 'a';
        System.out.println(a);
    }

    public static int firstUniqChar(String s) {
        int[] lookup = new int[26];
        for(int i = 0 ; i < s.length(); i++){
            lookup[s.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i < s.length(); i++){
            if(lookup[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
}
