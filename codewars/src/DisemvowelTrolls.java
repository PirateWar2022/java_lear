import java.util.ArrayList;

public class DisemvowelTrolls {
    private String str;

    public DisemvowelTrolls(String str){
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String unvocal() {
        String vocals = "euioaEUIOA";
        for (char c: vocals.toCharArray()) {
            this.str = this.str.replace(String.valueOf(c), "");
        }
        return this.str;
    }
}
