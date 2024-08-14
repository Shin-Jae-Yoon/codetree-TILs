import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        HashMap<Integer, Integer> map = new HashMap<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int key = Integer.parseInt(st.nextToken());
            
            if (command.equals("add")) {
                int value = Integer.parseInt(st.nextToken());
                map.put(key, value);
            }

            if (command.equals("find")) {
                if (map.containsKey(key)) {
                    sb.append(map.get(key));    
                } else {
                    sb.append("None");
                }
                
                sb.append("\n");
            }

            if (command.equals("remove")) {
                map.remove(key);
            }
        }

        System.out.print(sb.toString());
    }
}