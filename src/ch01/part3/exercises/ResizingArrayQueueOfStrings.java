package ch01.part3.exercises;

public class ResizingArrayQueueOfStrings {
    private String[] items;
    private int n;
    private int headPosition;
    private int tailPosition;

    public ResizingArrayQueueOfStrings() {
        items = new String[1];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void resize(int capacity) {
        String[] temp = new String[capacity];

        for (int i = 0; i < n; i++) {
            temp[i] = items[(headPosition + i) % items.length];
        }

        items = temp;
        headPosition = 0;
        tailPosition = n;
    }

    public void enqueue(String item) {

        if (n == items.length) {
            resize(items.length * 2);
        }

        if (tailPosition == items.length) {
            tailPosition = 0; // Wrap around
        }

        items[tailPosition++] = item;
        n++;
    }

    public String dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue underflow");
        } else {
            String item = items[headPosition];
            items[headPosition] = null; // To avoid loitering
            headPosition++;

            if (headPosition == items.length) {
                headPosition = 0; // Wrap around
            }
            n--;

            if (n > 0 && n == items.length / 4) {
                resize(items.length / 2);
            }

            return item;
        }
    }

}
