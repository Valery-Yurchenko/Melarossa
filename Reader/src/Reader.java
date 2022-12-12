import java.util.Arrays;

public class Reader {
    private String fullName;
    private int libraryCardNumber;
    private String faculty;
    private int dateOfBirth;
    private int phoneNumber;

    public Reader(String fullName, int libraryCardNumber, String faculty, int dateOfBirth, int phoneNumber) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int numberOfBooksTaken) {
        System.out.println(fullName + " взял " + numberOfBooksTaken + " книг(и).");
    }

    public void takeBook(String... nameOfTheBook) {
        System.out.println(fullName + " взял книг(и): " + Arrays.asList(nameOfTheBook));
    }

    public void takeBook(Book... book) {
        System.out.println(fullName + " взял книг(и): " + Arrays.asList(book));
    }

    public void returnBook(int numberOfBooksTaken) {
        System.out.println(fullName + " вернул " + numberOfBooksTaken + " книг(и).");
    }

    public void returnBook(String... nameOfTheBook) {
        System.out.println(fullName + " вернул книг(и): " + Arrays.asList(nameOfTheBook));
    }

    public void returnBook(Book... book) {
        System.out.println(fullName + " вернул книг(и): " + Arrays.asList(book));
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fullName='" + fullName + '\'' +
                ", libraryCardNumber=" + libraryCardNumber +
                ", faculty='" + faculty + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(int libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
