import java.util.Scanner;


public class grader {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade >=  38 && grade %5 != 0 && 5-(grade % 5) < 3) {
                grade += 5 - (grade % 5);
                output.append(grade + "\n");
                
            } else {
                output.append(grade + "\n");
            }


        }
        System.out.println(output.deleteCharAt(output.length() - 1));
    }
}
