class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;
        int []queue = new int[n];
        int front = 0, rear = 0, size = 0;
        for(int i=0;i<n;i++){
            queue[rear] = i;
            rear = (rear+1)%n;
            size++;
        }
        int []arr = new int[n];
        for(int card:deck){
            int index = queue[front];
            front = (front+1)%n;
            size--;
            arr[index] = card;
            if(size>0){
                int next=queue[front];
                front = (front+1)%n;
                size--;
                queue[rear] = next;
                rear = (rear+1)%n;
                size++;
            }
        }
        return arr;
    }
}