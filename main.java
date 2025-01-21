public class main {
    public static void main(String[] args) {
        MemorySpace memorySpace = new MemorySpace(100);
        String expected1 = "\n(0 , 5) (5 , 20) (25 , 20) (45 , 55) ";
        String expected2 = "(0 , 5) (25 , 20) \n(5 , 20) (45 , 55) ";
        String expected3 = "(0 , 45) \n(45 , 55) ";
        String expected = "true";
        String actual = "";
        boolean actualB = true;
        try {
            int address = memorySpace.malloc(5);
            int address1 = memorySpace.malloc(20);
            int address2 = memorySpace.malloc(20);
            int address3 = memorySpace.malloc(55);
            actualB = (actualB && address == 0 && address1 == 5 && address2 == 25 && address3 == 45 && memorySpace.toString().equals(expected1));
            memorySpace.free(address);
            memorySpace.free(address2);
            actualB = (actualB && memorySpace.toString().equals(expected2));
            memorySpace.defrag();
            actualB = (actualB && memorySpace.toString().equals(expected2));
            memorySpace.free(address1);
            memorySpace.defrag();
            actual += (actualB && memorySpace.toString().equals(expected3));
        } catch (Exception e) {
            actual = TesterMessagesEnum.ERROR + e.getMessage();
        }
    }
}
