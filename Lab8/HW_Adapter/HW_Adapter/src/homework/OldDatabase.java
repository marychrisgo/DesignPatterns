package homework;

import java.util.ArrayList;

public class OldDatabase {

    ArrayList<IndexCardRecord> records = new ArrayList<IndexCardRecord>();

    public void addBook(IndexCardRecord record) {
        records.add(record);
    }

    public ArrayList<IndexCardRecord> search(String searchText) {
        ArrayList<IndexCardRecord> matchingRecords = new ArrayList<IndexCardRecord>();
        for (int i = 0; i < records.size(); i++) {
            IndexCardRecord record = records.get(i);
            if (record.getData().contains(searchText)) {
                matchingRecords.add(record);
            }
        }
        System.out.println(matchingRecords.size() + " matches found");
        for (int i = 0; i < matchingRecords.size(); i++) {
            System.out.println(matchingRecords.get(i));
        }
        return matchingRecords;
    }

}
