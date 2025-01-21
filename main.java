public class main {
    public static void main(String[] args) {
        MemorySpace memorySpace = new MemorySpace(100);
        String expectedText = "(0 , 50) \n(50 , 50) ";
        String expected = "true";
        String actual = "";
        try {
            int address = memorySpace.malloc(50);
            memorySpace.malloc(50);
            memorySpace.free(address);
            memorySpace.free(address);
            actual += (memorySpace.toString().equals(expectedText));
        } catch (Exception e) {
            actual = TesterMessagesEnum.ERROR + e.getMessage();
        }
    }
}
