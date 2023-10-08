package StructuralPatterns._09_Decorator.After;

public class TrimminCommentDecorator extends CommentDecorator {
    public TrimminCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("...", "");
    }
}
