import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int result = 0;
		
		String NM = br.readLine();
		int N = Integer.parseInt(NM.split(" ")[0]);
		int M = Integer.parseInt(NM.split(" ")[1]);
		
		String card = br.readLine();
		String[] cards = card.split(" ");
		int[] cardNum = new int[cards.length];
		int idx = 0;
		for(String s : cards) {
			cardNum[idx] = Integer.parseInt(s);
			idx++;
		}
		
		result = blackJack(cardNum, N, M);
		
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}
	
	static int blackJack(int[] cards, int N, int M) {
		int result = 0;
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				for(int k=j+1; k<N; k++) {
					int sum = cards[k] + cards[j] + cards[i] ;
					if ( sum > result && sum <=M ) {
						result = sum;
					}
				}
			}
		}
		return result;
	}
}
/*
53026623	dnffktmdgml	 2798	맞았습니다!!	14136	128	Java 11 / 수정	1163	
*/