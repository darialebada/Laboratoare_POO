public interface DocumentVisitor {
    void visit(ItalicTextSegment seg);
    void visit(BoldTextSegment seg);
    void visit(UrlSegment seg);
    void visit(PlainTextSegment seg);
    StringBuilder getDocument();
}
