public class Main {
    public static void main(String[] args) {
        Reader[] reader = new Reader[3];
        reader[0] = new Reader("vasya", 1,
                "mathematical", 12, 1112233);
        reader[1] = new Reader("fedya", 2,
                "chemical", 21, 2223344);
        reader[2] = new Reader("yura", 3,
                "biological", 15, 3334455);


        reader[0].takeBook(3);
        reader[2].returnBook(4);

        reader[1].takeBook("adventure", "dictionary", "encyclopedia");
        reader[0].returnBook("adventure", "dictionary", "encyclopedia", "detective");

        Book book = new Book("john");
        Book book1 = new Book("ted");
        Book book2 = new Book("fredy");
        reader[2].takeBook(book, book1, book2);
    }
}
