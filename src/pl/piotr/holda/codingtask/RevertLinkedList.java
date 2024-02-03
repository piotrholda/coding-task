package pl.piotr.holda.codingtask;

import java.util.LinkedList;
import java.util.List;

class RevertLinkedList {

    <T> List<T> revert(LinkedList<T> list) {
        List<T> reverted = new LinkedList<>();
        while (!list.isEmpty()) {
            T curr = list.poll();
            reverted.addFirst(curr);
        }
        return reverted;
    }

    <T> void revertAndLog(LinkedList<T> list) {
        list.forEach(el -> System.out.print(el + ", "));
        System.out.print(" -> ");
        List<T> reverted = revert(list);
        reverted.forEach(el -> System.out.print(el + ", "));
        System.out.println();
    }

    public static void main(String[] args) {
        RevertLinkedList app = new RevertLinkedList();
        app.revertAndLog(new LinkedList<>(List.of()));
        app.revertAndLog(new LinkedList<>(List.of("A")));
        app.revertAndLog(new LinkedList<>(List.of("A", "B", "C")));
    }
}
