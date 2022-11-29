public class UrlSegment extends TextSegment {
    private String description;

    public UrlSegment(String url, String description) {
        super(url);
        this.description = description;
    }

    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }

    public String getDescription() {
        return description;
    }
}
