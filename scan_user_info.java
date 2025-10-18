public class scan_user_info {
    public static void main(String[] args)
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        String ageInput = scanner.nextLine();
        Integer age = null;
        try {
            age = Integer.parseInt(ageInput);
        } catch (NumberFormatException e) {
            // invalid age input, age stays null
        }

        System.out.print("Enter your height in meters (e.g., 1.75): ");
        String heightInput = scanner.nextLine();
        Double height = null;
        try {
            height = Double.parseDouble(heightInput);
        } catch (NumberFormatException e) {
            // invalid height input, height stays null
        }

        System.out.println("User Information:");
        System.out.println("Name: " + name);
        if (name.isEmpty()) {
            System.out.println("Name is empty");
        }
        
        if (age != null) {
            System.out.println("Age: " + age);
        } else {
            System.out.println("Age should be a number");
        }

        if (height != null) {
            System.out.println("Height: " + height + " meters");
        } else {
            System.out.println("Height should be a valid decimal number");
        }

        scanner.close();
    }
}
