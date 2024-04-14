import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A_k_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String str = sc.next();
        sc.close();
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        boolean isValid = true;
        for (int count : frequencyMap.values()) {
            if (count % k != 0) {
                isValid = false;
                break;
            }
        }
        if (!isValid) {
            System.out.println(-1); 
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : frequencyMap.keySet()) {
            int count = frequencyMap.get(ch);
            for (int i = 0; i < count / k; i++) {
                sb.append(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < k; i++) {
            result.append(sb);
        }
        System.out.println(result);
    }
}
