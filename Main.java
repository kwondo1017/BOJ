import java.util.PriorityQueue;
import java.util.Collections;

public class Main {
    static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // 최대 힙 (작은 값들)
    static PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // 최소 힙 (큰 값들)

    static void addNum(int num) {
        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
            maxHeap.offer(num); // 작은 값은 maxHeap으로
        } else {
            minHeap.offer(num); // 큰 값은 minHeap으로
        }

        // 힙 크기 균형 맞추기
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.offer(maxHeap.poll()); // maxHeap에서 하나 minHeap으로
        } 
        else if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll()); // minHeap에서 하나 maxHeap으로
        }
    }

    static double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0; // 짝수 개
        } else {
            return maxHeap.peek(); // 홀수 개 (maxHeap이 더 큼)
        }
    }

    public static void main(String[] args) {
        // 테스트
        addNum(1);
        System.out.println(findMedian()); // 1.0
        addNum(2);
        System.out.println(findMedian()); // 1.5
        addNum(3);
        System.out.println(findMedian()); // 2.0
    }
}

