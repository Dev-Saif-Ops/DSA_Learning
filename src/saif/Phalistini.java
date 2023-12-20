package saif;

public class Phalistini {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;

        // For upper band
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= m; j++){
                System.out.print("☪  لا إله إلا الله محمد رسول الله ☪");
            }
            System.out.println();
        }

        // for upper half pyramid
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("☪ القدس ☪");
            }
            System.out.println();
        }

        // for lower half pyramid
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("☪ القدس ☪");
            }
            System.out.println();
        }

        // for lower band
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= m; j++){
                System.out.print("☪  لا إله إلا الله محمد رسول الله ☪");
            }
            System.out.println();
        }
    }
}
