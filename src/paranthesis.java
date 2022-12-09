public class paranthesis {
    public static void main(String[] args) {
        try {
            System.out.println(match("(())"));
            System.out.println(match("(((((())"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static boolean match(String prans) throws Exception{
        int count=0;
        char chars[]=prans.toCharArray();
        for (char c:chars){
            if (c=='('){
                count++;
            } else if (c==')') {
                if(count>0)
                    count--;
                else
                    return false;
            }
            else {
                throw new Exception("invalid character"+c);
            }
        }if(count==0)
            return true;
        else
            return false;
    }
}

