package algorithmWeek2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ12865 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken()); //개수
		int K = Integer.parseInt(st.nextToken()); //무게
		
		int[] dp = new int[K+1];
		int[] w = new int[N+1];
		int[] v = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			w[i] = Integer.parseInt(st.nextToken());
			v[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=1; i<=N; i++) {
			for(int j=K; j>=1; j--) {
				if(w[i] <= j)
					dp[j] = Math.max(dp[j], dp[j-w[i]] + v[i]);
			}
		}
		System.out.print(dp[K]);
	}

}
