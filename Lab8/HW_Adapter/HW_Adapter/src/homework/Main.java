package homework;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<IndexCardRecord> oldRecords = new ArrayList<IndexCardRecord>();
        oldRecords.add(new IndexCardRecord("Jane Austen|Pride and Prejudice|Classic"));
        oldRecords.add(new IndexCardRecord("Harper Lee|To Kill a Mockingbird|Classic"));
        oldRecords.add(new IndexCardRecord("F. Scott Fitzgerald|The Great Gatsby|Classic"));
        oldRecords.add(new IndexCardRecord("Herman Melville|Moby-Dick|Classic"));
        oldRecords.add(new IndexCardRecord("C.S. Lewis|The Lion, the Witch and the Wardrobe|Classic"));

        ArrayList<BookRecord> currentRecords = new ArrayList<BookRecord>();
        currentRecords.add(new BookRecord("Bram Stoker", "Dracula", "Classic"));
        currentRecords.add(new BookRecord("J. R. R. Tolkien", "The Lord of the Rings", "Fantasy"));
        currentRecords.add(new BookRecord("Homer ", "The Iliad", "Mythology"));
        currentRecords.add(new BookRecord("Sun-Tzu", "The Art of War", "Military"));

        OldDatabase oldDatabase = new OldDatabase();
        for (int i = 0; i < oldRecords.size(); i++) {
            IndexCardRecord indexCardRecord = oldRecords.get(i);
            oldDatabase.addBook(indexCardRecord);
        }

        ModernDatabase modernDatabase = new ModernDatabase();
        for (int i = 0; i < currentRecords.size(); i++) {
            BookRecord bookRecord = currentRecords.get(i);
            modernDatabase.addBook(bookRecord);
        }
        for (int i = 0; i < oldRecords.size(); i++) {
            IndexCardRecord indexCardRecord = oldRecords.get(i);
            modernDatabase.addBook(new BookRecordAdapter(indexCardRecord));
        }

        oldDatabase.search("Scott");
        System.out.println("");

        modernDatabase.search("Melville");
        System.out.println("");

        modernDatabase.search("Dracula");
        System.out.println("");


    }
}
