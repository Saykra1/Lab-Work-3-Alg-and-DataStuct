import java.util.*;

public class Main {
    public static int getMin(PriorityQueue<Integer> heap) {
        if (heap.isEmpty()) {
            throw new RuntimeException("Heap is empty");
        }
        int minEl = Integer.MAX_VALUE;
        // Создаем копию очереди для итерации без изменения исходной
        for (int num : new PriorityQueue<>(heap)) {
            minEl = Math.min(minEl, num);
        }
        return minEl;
    }

    public static void main(String[] args) {
        // Создаем max-кучу с обратным компаратором
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); //по умолчанию PriorityQueue в JAVA,
        // как и в Python создает такую кучу, что в корне находится минимальный эл-т, а нам нужен максимальный,
        // по этому мы создаём объект с кастомным компаратором и делаем его развёрнутым (чтобы Max эл-т находился в корне)

        maxHeap.add(5);
        maxHeap.add(2);
        maxHeap.add(10);
        maxHeap.add(1);

        // Задание 1
        System.out.println("Max элемент кучи: " + maxHeap.peek());
        System.out.println("Размер кучи: " + maxHeap.size());

        // Задание 2
        System.out.println("Min элемент кучи: " + getMin(maxHeap)); // Действуе м как и в C++ (в связи с отсутствием встроенной функции)

        // Это не самое эффективное решение как для Java, так и для C++, для такого задания вообще Бинарная куча не очень подходит,
        // лучше было использовать красно-чёрное дерево, тода код работал бы быстрее и занял бы меньше памяти.
        // Пример:
        /*
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(5); numbers.add(2); numbers.add(10); numbers.add(1);

        System.out.println("Max: " + numbers.last());  // 10
        System.out.println("Size: " + numbers.size()); // 4
        System.out.println("Min: " + numbers.first()); // 1
        */
    }
}