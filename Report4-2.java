import java.util.Scanner;
// shortest path algorithm
// branch update
// improve output formatting
class FlowerNumber{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("数字を入力してください。");
        int n = stdIn.nextInt();

        String nS = Integer.toString(n);

        for(int i = 0; i < nS.length(); i++){
            char digitChar = nS.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            switch (digit) {
                case 0:
                    System.out.println("  ***  ");
                    System.out.println(" *   * ");
                    System.out.println(" *   * ");
                    System.out.println(" *   * ");
                    System.out.println(" *   * ");
                    System.out.println(" *   * ");
                    System.out.println("  ***  ");
                    break;
                case 1:
                    System.out.println("   *   ");
                    System.out.println("  **   ");
                    System.out.println(" * *   ");
                    System.out.println("   *   ");
                    System.out.println("   *   ");
                    System.out.println("   *   ");
                    System.out.println(" *****  ");
                    System.out.println();
                break;
                case 2:
                    System.out.println("  ***  ");
                    System.out.println("     * ");
                    System.out.println("     * ");
                    System.out.println("  ***  ");
                    System.out.println(" *     ");
                    System.out.println(" *     ");
                    System.out.println("  ***  ");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("  ***  ");
                    System.out.println("     * ");
                    System.out.println("     * ");
                    System.out.println("  ***  ");
                    System.out.println("     * ");
                    System.out.println("     * ");
                    System.out.println("  ***  ");
                    System.out.println();
                    break;
                case 4:
                    System.out.println(" *   * ");
                    System.out.println(" *   * ");
                    System.out.println(" *   * ");
                    System.out.println(" ***** ");
                    System.out.println("     * ");
                    System.out.println("     * ");
                    System.out.println("     * ");
                    System.out.println();
                    break;
                case 5:
                    System.out.println(" ***** ");
                    System.out.println(" *     ");
                    System.out.println(" *     ");
                    System.out.println(" ***** ");
                    System.out.println("     * ");
                    System.out.println("     * ");
                    System.out.println(" ***** ");
                    System.out.println();
                    break;
                case 6:
                    System.out.println("  ***  ");
                    System.out.println(" *     ");
                    System.out.println(" *     ");
                    System.out.println(" ***** ");
                    System.out.println(" *   * ");
                    System.out.println(" *   * ");
                    System.out.println("  ***  ");
                    System.out.println();
                    break;
                case 7:
                    System.out.println("****** ");
                    System.out.println("     * ");
                    System.out.println("    *  ");
                    System.out.println("   *   ");
                    System.out.println("  *    ");
                    System.out.println(" *     ");
                    System.out.println("*      ");
                    System.out.println();
                    break;
                case 8:
                    System.out.println("  ***  ");
                    System.out.println(" *   * ");
                    System.out.println(" *   * ");
                    System.out.println("  ***  ");
                    System.out.println(" *   * ");
                    System.out.println(" *   * ");
                    System.out.println("  ***  ");
                    System.out.println();
                    break;
                case 9:
                    System.out.println("  ***  ");
                    System.out.println(" *   * ");
                    System.out.println(" *   * ");
                    System.out.println("  **** ");
                    System.out.println("     * ");
                    System.out.println("     * ");
                    System.out.println("  ***  ");
                    System.out.println();
                    break;
            }
        } 

        stdIn.close();
    }
}