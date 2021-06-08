package homework;

public class BookRecordAdapter extends BookRecord {

    private IndexCardRecord record;

    public BookRecordAdapter(IndexCardRecord record) {
        super(null, null, null);
        this.record = record;
    }

    @Override
    public String getAuthor() {
        String[] parts = record.getData().split("|");
        return parts[0];
    }

    @Override
    public String getTitle() {
        String[] parts = record.getData().split("|");
        return parts[1];
    }

    @Override
    public String getLocation() {
        String[] parts = record.getData().split("|");
        return parts[2];
    }
}
