import java.util.List;

/**
 * Uses visitors to parse documents and provide dokuwiki and markdown outputs.
 */
public class WikiGenerator {

    private final List<TextSegment> textSegments;

    public WikiGenerator(List<TextSegment> textSegments) {
        this.textSegments = textSegments;
    }

    public StringBuilder getDokuWikiDocument() {
        StringBuilder text = new StringBuilder();
        DokuWikiVisitor doc = new DokuWikiVisitor();
        for (TextSegment textSegment : textSegments) {
            textSegment.accept(doc);
        }
        return doc.getDocument();
    }

    public StringBuilder getMarkdownDocument() {
        MarkdownVisitor doc = new MarkdownVisitor();
        for (TextSegment textSegment : textSegments) {
            textSegment.accept(doc);
        }
        return doc.getDocument();
    }
}