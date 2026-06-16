public class CodingGuildMember {
    public static void main(String[] args) {

        String name = "Ravi";
        int age = 22;
        char rank = 'A';
        double salary = 50000.0;
        float membershipFee = 999.99f;

        double bonus = salary * 0.12;
        int bonusInt = (int) bonus;

        System.out.println("===== WELCOME TO CODING GUILD =====");
        System.out.println("Name            : " + name);
        System.out.println("Age             : " + age);
        System.out.println("Rank            : " + rank);
        System.out.println("Salary          : " + salary);
        System.out.println("Membership Fee  : " + membershipFee);
        System.out.println("Annual Bonus    : " + bonusInt);
        System.out.println("====================================");
    }
}