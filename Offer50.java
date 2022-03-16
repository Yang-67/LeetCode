public class Offer50 {
    public char firstUniqChar(String s) {
        if(s.equals("")){
            return ' ';
        }
        for (int i = 0; i < s.length(); i++) {
            char str = s.charAt(i);
            if(s.indexOf(str) == i && s.indexOf(str,i+1) == -1){
                return str;
            }
        }
        return ' ';
    }
}


/**
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 */