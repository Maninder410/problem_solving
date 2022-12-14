package strings;

public class sringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int n = 1000000;
        long start = System.currentTimeMillis();
        for(int i = 0;i<n;i++){
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);
        // System.out.println(sb);
        // char ch = sb.charAt(2);
        // System.out.println(ch);
        // sb.setCharAt(0, 'd');
        // System.out.println(sb);
        // sb.insert(2, 'y');
        // System.out.println(sb);
        // sb.deleteCharAt(4);
        // System.out.println(sb);
        // sb.append('x');//adds the char at the last of the string 
        // System.out.println(sb);
        //always use string bulider because it's performance is better
        
    }
}
