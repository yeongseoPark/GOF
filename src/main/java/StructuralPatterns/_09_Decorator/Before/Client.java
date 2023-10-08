package StructuralPatterns._09_Decorator.Before;

public class Client {

    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
        Client client = new Client(new TrimminCommentService()); // 상속을 사용하면 Trimming과 SpamFiltering을 동시에 하기 힘들다(단일 상속만 가능해서)
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");
    }

}
