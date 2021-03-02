package domain;

import java.util.Date;

public class Post {
    private String postType;
    private int postId;
    private int ownerId;
    private int count;
    private int offset;
    private String domain;
    private String query;
    private Date date;
    private String text;
    private LikesInfo likes;
    private Repost repost;
    private CommentsInfo comments;
    private boolean canEdit;
    private boolean canDelete;
    private boolean canPin;
    private boolean canReplyOwnerId;
    private boolean canReplyPostId;
    private boolean isPinned;
    private boolean isFavorite;
    private boolean markedAsAds;
    private boolean friendsOnly;
    private boolean ownersOnly;

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LikesInfo getLikes() {
        return likes;
    }

    public void setLikes(LikesInfo likes) {
        this.likes = likes;
    }

    public Repost getRepost() {
        return repost;
    }

    public void setRepost(Repost repost) {
        this.repost = repost;
    }

    public CommentsInfo getComments() {
        return comments;
    }

    public void setComments(CommentsInfo comments) {
        this.comments = comments;
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

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanReplyOwnerId() {
        return canReplyOwnerId;
    }

    public void setCanReplyOwnerId(boolean canReplyOwnerId) {
        this.canReplyOwnerId = canReplyOwnerId;
    }

    public boolean isCanReplyPostId() {
        return canReplyPostId;
    }

    public void setCanReplyPostId(boolean canReplyPostId) {
        this.canReplyPostId = canReplyPostId;
    }

    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public int getCount() { return count;}

    public void setCount(int count) { this.count = count; }

    public int getOffset() { return offset; }

    public void setOffset(int offset) { this.offset = offset; }

    public String getDomain() { return domain; }

    public void setDomain(String domain) { this.domain = domain; }

    public String getQuery() { return query; }

    public void setQuery(String query) { this.query = query; }

    public boolean isOwnersOnly() { return ownersOnly; }

    public void setOwnersOnly(boolean ownersOnly) { this.ownersOnly = ownersOnly; }

}
