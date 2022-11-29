public class MarkdownVisitor implements DocumentVisitor {
    private StringBuilder doc = new StringBuilder();

    @Override
    public void visit(ItalicTextSegment seg) {
        StringBuilder italicText = new StringBuilder();
        italicText.append("*");
        italicText.append(seg.getContent());
        italicText.append("*");
        doc.append(italicText);
    }

    @Override
    public void visit(BoldTextSegment seg) {
        StringBuilder boldText = new StringBuilder();
        boldText.append("**");
        boldText.append(seg.getContent());
        boldText.append("**");
        doc.append(boldText);
    }

    @Override
    public void visit(UrlSegment seg) {
        StringBuilder urlText = new StringBuilder();
        urlText.append("[");
        urlText.append(seg.getDescription());
        urlText.append("](");
        urlText.append(seg.getContent());
        urlText.append(")");
        doc.append(urlText);
    }

    @Override
    public void visit(PlainTextSegment seg) {
        StringBuilder plainText = new StringBuilder(seg.getContent());
        doc.append(plainText);
    }

    @Override
    public StringBuilder getDocument() {
        return doc;
    }
}
