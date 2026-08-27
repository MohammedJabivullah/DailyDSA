//    Problem 344 Reverse String
//Write a function that reverses a string. The input string is given as an array of characters s.
//
//    You must do this by modifying the input array in-place with O(1) extra memory.
//
//    Example 1:
//    Input: s = ["h","e","l","l","o"]
//    Output: ["o","l","l","e","h"]
public class ReverseString_344 {

    public void reverseString(char[] s) {
        int n= (int) ((s.length/2)+0.5);
        for(int i=0;i<n;i++){
            char temp = s[i];
            s[i] = s[(s.length-1)-i];
            s[(s.length-1)-i] = temp;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        //sample 2
//        char[] s = {'A', ' ', 'm', 'a', 'n', ',', ' ',
//            'a', ' ', 'p', 'l', 'a', 'n', ',', ' ',
//            'a', ' ', 'c', 'a', 'n', 'a', 'l', ':', ' ',
//            'P', 'a', 'n', 'a', 'm', 'a'
//        };

        ReverseString_344 obj = new ReverseString_344();
        obj.reverseString(s);
        for(char c : s){
            System.out.print("\""+c+"\" ");
        }
    }
}
