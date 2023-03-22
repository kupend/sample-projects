public class Main {
    public static void main(String[] args)  {

        for (int i = 1; i <= 5; i++) {
           LPAstudent s = new LPAstudent("S987654" + i,
                    switch(i) {
                case 1 -> "mary";
                case 2 -> "nina";
                case 3 -> "sinea";
                case 4 -> "minea";
                case 5 -> "tinea";
                default ->  "anonymous";
                    },
                    "05/08/2020",
                    "java master class");

            System.out.println(s);
        }
    }
}
