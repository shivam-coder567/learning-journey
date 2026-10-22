import java.util.Scanner;
public class SwitchNested {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int EmpId = in.nextInt();
        String department = in.next();
        switch (EmpId) {
            case 1:
                System.out.println("shivam mishra");
                break;
            case 2:
                System.out.println("yashashvi sharma ");
                break;
                case 3:
                    System.out.println("vishwas pratap singh");
                    switch (department) {
                        case "IT":  
                        System.out.println("IT");
                            break;
                        case "Manager":
                            System.out.println("MANAGER");
                            break;
                    }
                    break;
            default:
                System.out.println("ENTER CORRECT EmpTD");
                break;
        }
    }
}
