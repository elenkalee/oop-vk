package domain;

public class Repost {
    private int count;
    private boolean canRepost;
    private boolean userReposted;
    private String textReposted;

    public boolean isCanRepost() {
        return canRepost;
    }

    public void setCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }

    public int getCount () {
        return count;
    }

    public void setCount (int count) {
        this.count = count;
    }

    public boolean isUserReposted () {
        return userReposted;
    }

    public void setUserReposted (boolean userReposted) {
        this.userReposted = userReposted;
    }

    public String getTextReposted() {
        return textReposted;
    }

    public void setTextReposted(String textReposted) {
        this.textReposted = textReposted;
    }
}
