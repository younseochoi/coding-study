package hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

// 테스트 정확도 53....
public class 베스트앨범 {

	class Album{
		String genre;
		int play_count;
		int index;
		@Override
		public String toString() {
			return genre + " "+ play_count+" "+index;
		}
		
		
	}
	
	 public int[] solution(String[] genres, int[] plays) {
	        int[] answer = {};
	        HashMap<String, Integer> map = new HashMap<>(); // < 장르 , 장르별 재생횟수 총합 >
	        HashMap<String, Integer> map2 = new HashMap<>(); // <장르, 장르별 곡 개수> 
	        List<Album> album_list= new ArrayList<>();
	        ArrayList<Integer> answer_list = new ArrayList<>();

	        for(int i=0;i< genres.length;i++) { 
	        	
	        	// 장르별 재생횟수 총합 구하기
	        	map.put(genres[i], map.getOrDefault(genres[i],0)+plays[i]);
	        	
	        	// 장르별 곡 개수 구하기
	        	if(map.get(genres[i])!=null) {
	        		map2.put(genres[i],map2.getOrDefault(genres[i],0)+1);
	        	}
	        }
	        
	        

	        // 장르별 재생횟수 총합으로 내림차순 정렬 -> 가장 많이 재생된 장르순으로 정렬
	        List<String> sorted_key = new ArrayList<>(map.keySet());
	        Collections.sort(sorted_key, (n1, n2) -> map.get(n2).compareTo(map.get(n1)));
//	        Collections.sort(sorted_key, new Comparator<String>() {
//	        	@Override
//	        	public int compare(String s1, String s2) {
//	        		System.out.println(s1+" "+s2+"                  00000??");
//	        		if( map.get(s2).compareTo(map.get(s1))!=0) { //같은 재생 횟수면 인덱스 빠른 것 부터 수록
//	        			return map.get(s2).compareTo(map.get(s1));
//	        			
//	        		}else {
//	        			System.out.println(map.get(s1)+" "+map.get(s2));
//	        			return map.get(s1).compareTo(map.get(s2));
//	        		}
//	        	}
//	        	
//	        });
    
	        
	        // 총 재생 횟수 많은 장르 순서로, 같은 장르 내 재생 횟수 내림차순 정렬 
	        for(String s:sorted_key) {
	        	for(int i = 0;i< genres.length;i++) {
	        		if(s.equals(genres[i])) {
	        			Album album = new Album();
	    	        	album.genre = genres[i];
	    	        	album.play_count = plays[i];
	    	        	album.index = i ;
	    	        	album_list.add(album);
	        		}
	        	}
	        	
	        	// 같은 장르 내 재생횟수 내림차순 정렬 
	        	Collections.sort(album_list, new Comparator<Album>() {
	        		@Override
	        		public int compare(Album o1, Album o2) {
	        			if((o1.genre).compareTo(o2.genre)==0) {
	        				if(o1.play_count>o2.play_count) {
	        					return -1;
	        				}else if(o1.play_count==o2.play_count) {
	        					if(o1.index>o2.index) return 1;
	        				}
	        			}
	        			
	        			return 1;
	        		}
	        		
	        	});
	        }
	       


	         // 큰거 2개 가져오기
	         for(int i =0;i<genres.length;) {
	        	 if(map2.get(album_list.get(i).genre)<2){
	        		 answer_list.add(album_list.get(i).index);
	        		 i+=1;
	        	 }else {
	        		 answer_list.add(album_list.get(i).index);
	        		 answer_list.add(album_list.get(i+1).index);
	        		 i+=map2.get(album_list.get(i).genre);
	        	 }
	       	 }
	        

	         // ArrayList -> 배열
	        answer = new int[answer_list.size()];
	        for(int i=0;i<answer_list.size();i++) {
	        	answer[i] = answer_list.get(i);
	        }
	        
	        for(int i:answer) {
	        	System.out.print(i+" ");
	        }
	        System.out.println();
	        return answer;
	    }
}

//
//테스트 1 〉	통과 (0.84ms, 72.5MB)
//테스트 2 〉	통과 (0.77ms, 81.2MB)
//테스트 3 〉	통과 (0.70ms, 74.2MB)
//테스트 4 〉	통과 (0.86ms, 77.1MB)
//테스트 5 〉	실패 (1.36ms, 76.5MB)
//테스트 6 〉	실패 (1.31ms, 75.6MB)
//테스트 7 〉	실패 (1.22ms, 73.9MB)
//테스트 8 〉	통과 (0.98ms, 74MB)
//테스트 9 〉	통과 (0.77ms, 79.6MB)
//테스트 10 〉	실패 (1.50ms, 76.5MB)
//테스트 11 〉	통과 (0.80ms, 77.5MB)
//테스트 12 〉	실패 (1.11ms, 73.7MB)
//테스트 13 〉	실패 (1.54ms, 76.2MB)
//테스트 14 〉	실패 (1.55ms, 71.1MB)
//테스트 15 〉	통과 (0.71ms, 74.1MB)
