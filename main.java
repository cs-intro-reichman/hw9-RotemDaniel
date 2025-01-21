public class main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        MemoryBlock block = new MemoryBlock(10, 1000);
        list.addFirst(block);
        String expected = "true";
        String actual = "";
        boolean actualB = true;
        try {
            actualB = (actualB && list.getSize() == 1 && list.getFirst().block.equals(block) && list.getLast().block.equals(block));
            list.remove(0);
            actual += (actualB && list.getSize() == 0 && list.getFirst() == null && list.getLast() == null);
        } catch (Exception e) {
            actual = TesterMessagesEnum.ERROR + e.getMessage();
        }
    }
}
