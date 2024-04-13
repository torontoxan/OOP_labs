import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static LibraryMember[] libraryMembers = new LibraryMember[5];

    public static void main(String[] args) {
        LibraryMember member1 = new LibraryMember();
        System.out.println("Читач 1 (конструктор по замовчуванню):");
        System.out.println(member1);

        List<String> books2 = Arrays.asList("Таємниці природи", "Історія світу");
        LibraryMember member2 = new LibraryMember(2, "Петров", "Олег", "Вікторович", "0987654321", "вул. Шевченка, 5", new Date(), Boolean.valueOf(false), books2);
        System.out.println("Читач 2 (параметризований конструктор):");
        System.out.println(member2);

        LibraryMember member3 = new LibraryMember(member2);
        System.out.println("Читач 3 (конструктор копіювання):");
        System.out.println(member3);


        System.out.println(LibraryMember.getCounter());
    }

    static void fillTestData() {
        List<String> books1 = Arrays.asList("Кобзар", "Гайдамаки");
        List<String> books2 = Arrays.asList("Земля", "Тигролови");
        libraryMembers[0] = new LibraryMember(1, "Степаненко", "Іван", "Олександрович", "123456789", "вул. Мазепи, 1", new Date(), Boolean.valueOf(false), books1);
        libraryMembers[1] = new LibraryMember(2, "Стеценко", "Петро", "Іванович", "987654321", "вул. Шевченка, 2", new Date(), Boolean.valueOf(true), books2);
    }

    static void printAllMembers() {
        System.out.println("Усі читачі бібліотеки:");
        for (LibraryMember member : libraryMembers) {
            if (member != null) {
                System.out.println(member);
            }
        }
        System.out.println();
    }

    static void printInactiveMembers() {
        System.out.println("Введіть кількість днів для фільтрування читачів, які не відвідували бібліотеку:");
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        System.out.println("Читачі, які більше " + days + " днів не відвідували бібліотеку:");
        Date currentDate = new Date();
        for (LibraryMember member : libraryMembers) {
            if (member != null && (currentDate.getTime() - member.getLastVisitDate().getTime()) / (1000 * 60 * 60 * 24) > days) {
                System.out.println(member);
            }
        }
        System.out.println();
    }

    static void printInactiveMembers(int days) {
        System.out.println("Читачі, які більше " + days + " днів не відвідували бібліотеку:");
        Date currentDate = new Date();
        for (LibraryMember member : libraryMembers) {
            if (member != null && (currentDate.getTime() - member.getLastVisitDate().getTime()) / (1000 * 60 * 60 * 24) > days) {
                System.out.println(member);
            }
        }
        System.out.println();
    }

    static void printMembersWithOverdueIncidents() {
        System.out.println("Читачі з прецедентами прострочення терміну взяття книги:");
        for (LibraryMember member : libraryMembers) {
            if (member != null && member.isOverdueIncidents().booleanValue()) {
                System.out.println(member);
            }
        }
        System.out.println();
    }
}