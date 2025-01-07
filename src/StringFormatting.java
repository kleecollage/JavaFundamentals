public class StringFormatting {
    public static void main(String[] args) {
        var name = "John";
        var age = 98;
        var salary = 55.3355;
        // String.format
        // %d = integer, %f = float, %s = string
        var message = String.format("Name: %s, Age: %d, Salary: %.2f", name, age, salary);
        System.out.println(message);
        // printf = .formatted
        // %n = line break
        System.out.printf("Name: %s, Age: %d, Salary: %.2f%n", name, age, salary);
        // Formatting with text block
        // \s = space
        var numberEmployee = 12;
        message = """
                %nPerson Detail:\s
                ------------------
                \tName: %s
                \tNo. Employee: %04d
                \tAge: %d years
                \tSalary: $%.2f
                """.formatted(name, numberEmployee, age, salary);
        System.out.println(message);
        // Formatting with text block and printf
        System.out.printf("""
                %nPerson Detail:\s
                ------------------
                \tName: %s
                \tNo. Employee: %04d
                \tAge: %d years
                \tSalary: $%.2f
                """, name, numberEmployee, age, salary);
    }
}
