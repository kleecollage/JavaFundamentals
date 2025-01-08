public class TriangleDrawing {
    public static void main(String[] args) {
        var console = new java.util.Scanner(System.in);
        System.out.print("Provides de number of rows: ");
        var rows = console.nextInt();

        for (int i = 1; i <= rows; i++) {
            var whiteSpaces = " ".repeat(rows - i);
            var stars = "*".repeat(i * 2 - 1);
            System.out.println(whiteSpaces + stars);
        }
    }
}
