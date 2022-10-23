public class aloritms {
    public boolean First(String str1, String str2) {
        if (str1.indexOf(str2) != -1) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean Second(String str1, String str2) {
        StringBuilder str_rev = new StringBuilder(str1).reverse();
        String str_rev_str = str_rev.toString();
        if (str_rev_str.equals(str2)) {
            return true;
        }
        else {
            return false;
        }
    }
   public void Third(String str, int size) {
       StringBuilder new_str = new StringBuilder();
       new_str.append(str.charAt(size));
       Third_last(new_str.toString());
       size = size - 1;
       if (size != -1){
           Third(str, size);
       }
   }


    private void Third_last(String str) {
        System.out.println(str);

    }

    public String Fours(int a, int b){

        StringBuilder str = new StringBuilder("");
        int plus = a + b;
        int minus = a - b;
        int mult = a * b;
        str.append(a + "+" + b + "=" + plus + " ");
        str.append(a + "-" + b + "=" + minus + " ");
        str.append(a + "*" + b + "=" + mult);
        return str.toString();
    }

    public String Fives(String normal_str, String changes_string, String ch) {
        StringBuilder norm_str = new StringBuilder(normal_str);
        int index = normal_str.indexOf(changes_string);
        norm_str.deleteCharAt(index);
        norm_str.insert(index, ch);

        return norm_str.toString();
    }
    public StringBuilder Sixes(String normal_str, String changes_string, String ch) {
        StringBuilder norm_str = new StringBuilder(normal_str);
        int index = normal_str.indexOf(changes_string);
        norm_str.replace(index, index, changes_string);
        return norm_str;
    }
    


    }




