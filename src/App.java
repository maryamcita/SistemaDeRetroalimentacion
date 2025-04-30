import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Evaluación y retroalimentación:\nInforma claramente los criterios de evaluación");
        System.out.println("1 - *\n2 - **\n3 - ***\n4 - ****\n5 - *****");
        String opcion = sc.nextLine();    
        switch (opcion) {
            case "1":
                System.out.println("la nota es: *");
                break;
            case "2":
                System.out.println("la nota es: **");
                break;
            case "3":
                System.out.println("la nota es: ***");
                break;
            case "4":
                System.out.println("la nota es: ****");
                break;
            case "5":
                System.out.println("la nota es: *****");
                break;
        }
        System.out.println("Las evaluaciones están relacionadas con los contenidos enseñados.");
        System.out.println("1 - *\n2 - **\n3 - ***\n4 - ****\n5 - *****");
        String opcion2 = sc.nextLine();    
        switch (opcion2) {
            case "1":
                System.out.println("la nota es: *");
                break;
            case "2":
                System.out.println("la nota es: **");
                break;
            case "3":
                System.out.println("la nota es: ***");
                break;
            case "4":
                System.out.println("la nota es: ****");
                break;
            case "5":
                System.out.println("la nota es: *****");
                break;
        }
        }
}
