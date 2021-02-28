package domain;

public class CommentsInfo {
    private int count;
    private boolean canPost;
    private boolean groupsCanPost;
    private boolean canClose;
    private boolean canOpen;
    private boolean canEdit;
    private boolean canDelete;
    private String textComment;
    private boolean canReplyComment;
    private boolean canReportComment;

    public int getCount () {
        return count;
    }

    public void setCount (int count) {
        this.count = count;
    }

    public boolean isCanPost () {
        return canPost;
    }

    public void setCanPost (boolean canPost) {
        this.canPost = canPost;
    }

    public boolean isGroupsCanPost () {
        return groupsCanPost;
    }

    public void setGroupsCanPost (boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isCanClose () {
        return canClose;
    }

    public void setCanClose (boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen () {
        return canOpen;
    }

    public void setCanOpen (boolean canOpen) {
        this.canOpen = canOpen;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public String getTextComment () {
        return textComment;
    }

    public void setTextComment (String textComment) {
        this.textComment = textComment;
    }

    public boolean isCanReplyComment() {
        return canReplyComment;
    }

    public void setCanReplyComment(boolean canReplyComment) {
        this.canReplyComment = canReplyComment;
    }

    public boolean isCanReportComment() {
        return canReportComment;
    }

    public void setCanReportComment(boolean canReportComment) {
        this.canReportComment = canReportComment;
    }
}
