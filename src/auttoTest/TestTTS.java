package auttoTest;

public class TestTTS {
//    12, 13, 14, 23, 24, 34
    public static void sol(int n, int k, String s, int i){
        if(s.length() == k){
            System.out.println(s);
        }
        String r = s;
        for(int j = i+1; j<=n; j++){
            s += j + "";
            sol(n, k, s, j);
            s = r;
        }
    }
    public static void main(String[] args) {
        int n =4, k =3;
        sol(n,k, "", 0);
    }
}
