import java.util.*;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Stack<string> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요: ");
        int n = scanner.nextInt();

        for (i = 0; i < n; i++) {
            String string = scanner.nextString();
            
            try {
                for (int j = 0; j < string.length; j++) {
                    if (string.charAt(j) == "(") {
                        stack.push("(");
                    }
                    else if(string.charat(j) == ")") {
                        stack.pop();
                    }
            }
            catch (Exception e) {
                System.out.println("NO");
            }
            System.out.println("YES");

            }

        }
    }
}