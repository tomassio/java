package demo;

class PersonDetails {
    String ahv;
    String name;
    double betrag;
}

public class Person {
    public static void main(String[] args) {
        // Create and initialise a PersonDetails object
        PersonDetails p = new PersonDetails();
        p.ahv = "1";
        p.name = "Tom Mueller";
        p.betrag = 88;

        // Initialise an array of PersonDetails objects with size 3
        PersonDetails[] person = new PersonDetails[1];
        // Assign the created PersonDetails object to the first element of the array
        person[0] = p;

        // Iterate through the array and print the details of each PersonDetails object
        for (PersonDetails per : person) {
            // Check if the current element is not null to avoid NullPointerException
            if (per != null) {
                System.out.println(per.name + ": " + per.betrag);
            } else {
                System.out.println("Null object in array");
            }
        }
    }
}
