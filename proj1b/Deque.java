public interface Deque<Item> {
    public boolean isEmpty();

    public int size();

    public void addFirst(Item item);

    public void addLast(Item item);

    public Item removeFirst();

    public Item removeLast();

    public Item get(int index);

    public void printDeque();
}
