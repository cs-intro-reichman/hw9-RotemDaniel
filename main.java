public class main {
    public static void main(String[] args) {
        MemorySpace memorySpace = new MemorySpace(100);
        String expectedText = "(0 , 100) \n";//space here needed 
        String expected = TesterMessagesEnum.ERROR + " IllegalArgumentException: index must be between 0 and size";
        String actual = "";
        try {
            memorySpace.free(0);
            actual += (memorySpace.toString().equals(expectedText));
        } catch (IllegalArgumentException e) {
            actual = TesterMessagesEnum.ERROR + " IllegalArgumentException: " + e.getMessage();
        } catch (Exception e) {
            actual = TesterMessagesEnum.ERROR + e.getMessage();
        }
    }
}
