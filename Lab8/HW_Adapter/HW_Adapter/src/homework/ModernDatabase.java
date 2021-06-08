package homework;

import java.util.ArrayList;

public class ModernDatabase {

    ArrayList<BookRecord> records = new ArrayList<BookRecord>();

    public void addBook(BookRecord record) {
        records.add(record);
    }

    public ArrayList<BookRecord> search(String searchText) {
        ArrayList<BookRecord> matchingRecords = new ArrayList<BookRecord>();
        for (int i = 0; i < records.size(); i++) {
            BookRecord bookRecord = records.get(i);
            if (bookRecord.getAuthor().contains(searchText)) {
                matchingRecords.add(bookRecord);
            } else if (bookRecord.getTitle().contains(searchText)) {
                matchingRecords.add(bookRecord);
            }
        }
        System.out.println(matchingRecords.size() + " matches found");
        for (int i = 0; i < matchingRecords.size(); i++) {
            System.out.println(matchingRecords.get(i));
        }
        return matchingRecords;
    }

}
