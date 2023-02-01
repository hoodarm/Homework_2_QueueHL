import ibadts.*;

public class Main {
    public static void main(String[] args) {
        int [] NUMBERS = {2,5,4,3,4,2,7,8,9};
        StaticQueue<Integer> queue = new StaticQueue<>(7);
        queueManipulator(NUMBERS, queue);
    }

    static void queueManipulator(int [] NUMBERS, StaticQueue<Integer> QUEUE)
    {
        int START = 0, END = NUMBERS.length - 1;
        int ELEMENT;
        boolean BEG = true;
        while (START<=END && (!QUEUE.isFull())) {
            if (BEG) {
                ELEMENT = NUMBERS[START];
                START = START + 1;
            } else {
                ELEMENT = NUMBERS[END];
                END = END - 1;
            }
            QUEUE.enqueue(ELEMENT);
            BEG = !BEG;
        }
        System.out.println(QUEUE);
    }
}