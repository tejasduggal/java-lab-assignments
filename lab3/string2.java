public class string2 {
    public static void main(String[] args) {
        String str = "I AM TEJAS DUGGAL";
        String result = "";

        String[] words = str.split(" ");  

        for (String w : words) {
            String rev = "";

            for (int i = w.length() - 1; i >= 0; i--) {
                rev += w.charAt(i);  
            }

            result += rev + " ";    
        }

        System.out.println("Reversed words: " + result.trim());
    }
}
