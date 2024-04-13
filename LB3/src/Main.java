import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static LibraryMember[] libraryMembers = new LibraryMember[5];

    public static void main(String[] args) {
        fillTestData();

        printAllMembers();

        printInactiveMembers(365);

        printMembersWithOverdueIncidents();
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