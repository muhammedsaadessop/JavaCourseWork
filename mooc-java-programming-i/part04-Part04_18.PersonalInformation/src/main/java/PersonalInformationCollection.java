
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {
    private ArrayList<PersonalInformation> informationList;

    public PersonalInformationCollection() {
        informationList = new ArrayList<>();
    }

    public void addPersonalInformation(PersonalInformation info) {
        informationList.add(info);
    }

    public void printAllInformation() {
        for (PersonalInformation info : informationList) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }
    }

    public static void main(String[] args) {
        PersonalInformationCollection collection = new PersonalInformationCollection();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()) {
                break;
            }

            System.out.print("");
            String lastName = scanner.nextLine();

            System.out.print("");
            String idNumber = scanner.nextLine();

         
            collection.addPersonalInformation(new PersonalInformation(firstName, lastName, idNumber));
        }

        collection.printAllInformation();
    }
}
