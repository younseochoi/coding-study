import java.util.*;

class Solution {
    
    int[][] answer;
    int idx;
    
    public int[][] solution(int[][] nodeinfo) {
       
        // 노드를 입력받는다.
        
        Node[] node = new Node[nodeinfo.length];
        for (int i=0; i<nodeinfo.length; i++) {
            node[i] = new Node(nodeinfo[i][0], nodeinfo[i][1], i+1, null, null);     
        }
        
        // y값이 큰 순서대로, y값이 같다면 x값이 작은 순서대로 정렬한다.
        
        Arrays.sort(node, new Comparator<Node>() {
            @Override
            public int compare(Node n1, Node n2) {
                if (n1.y == n2.y) return n1.x - n2.x;
                else return n2.y - n1.y;
            }
        });
        
        // 트리를 만든다.
        
        Node root = node[0];
        
        for (int i=1; i<node.length; i++) {
            insertNode(root, node[i]);
        }
        
        answer = new int[2][nodeinfo.length];
        idx = 0;
        preorder(root); // 전위 순회
        idx = 0;
        postorder(root); // 후위 순회
        
        return answer;
    }
    
    public void insertNode(Node parent, Node child) {
        if (parent.x > child.x) {
            if (parent.left == null) parent.left = child;
            else insertNode(parent.left, child);
        }
        else {
            if (parent.right == null) parent.right = child;
            else insertNode(parent.right, child);
        }
    }
    
    public void preorder(Node root) {
        if (root != null) {
            answer[0][idx++] = root.value;
            preorder(root.left);
            preorder(root.right);
        }
    }
    
    public void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            answer[1][idx++] = root.value;
        }
    }
    
    public class Node {
        int x;
        int y;
        int value;
        Node left;
        Node right;
        
        public Node(int x, int y, int value, Node left, Node right) {
            this.x = x;
            this.y = y;
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
}


/*
참고 : https://moonsbeen.tistory.com/175
정확성  테스트
테스트 1 〉	통과 (0.67ms, 73.8MB)
테스트 2 〉	통과 (0.71ms, 76.1MB)
테스트 3 〉	통과 (0.70ms, 67.3MB)
테스트 4 〉	통과 (0.65ms, 74.5MB)
테스트 5 〉	통과 (0.68ms, 68.1MB)
테스트 6 〉	통과 (6.86ms, 86.4MB)
테스트 7 〉	통과 (6.78ms, 82.5MB)
테스트 8 〉	통과 (7.52ms, 90.4MB)
테스트 9 〉	통과 (28.31ms, 92.5MB)
테스트 10 〉	통과 (3.75ms, 88.3MB)
테스트 11 〉	통과 (28.16ms, 91.3MB)
테스트 12 〉	통과 (24.15ms, 94.8MB)
테스트 13 〉	통과 (1.13ms, 73.6MB)
테스트 14 〉	통과 (3.78ms, 77.1MB)
테스트 15 〉	통과 (8.17ms, 86MB)
테스트 16 〉	통과 (12.94ms, 96.1MB)
테스트 17 〉	통과 (2.58ms, 87.1MB)
테스트 18 〉	통과 (12.01ms, 100MB)
테스트 19 〉	통과 (3.90ms, 80.8MB)
테스트 20 〉	통과 (6.44ms, 90.3MB)
테스트 21 〉	통과 (8.37ms, 99MB)
테스트 22 〉	통과 (11.47ms, 99.6MB)
테스트 23 〉	통과 (17.24ms, 102MB)
테스트 24 〉	통과 (0.47ms, 77.8MB)
테스트 25 〉	통과 (0.59ms, 71.4MB)
테스트 26 〉	통과 (9.63ms, 76.9MB)
테스트 27 〉	통과 (0.54ms, 76.9MB)
테스트 28 〉	통과 (0.48ms, 77.7MB)
테스트 29 〉	통과 (0.47ms, 77.9MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
