package RedditClone.DTO;

import RedditClone.Model.VoteType;

public class VoteDTO {
    private VoteType voteType;
    private Long postId;
    private Long userId;

    public VoteDTO() {
    }

    public VoteDTO(VoteType voteType, Long postId,Long userId) {
        this.voteType = voteType;
        this.postId = postId;
        this.userId = userId;
    }

    public VoteType getVoteType() {
        return voteType;
    }

    public void setVoteType(VoteType voteType) {
        this.voteType = voteType;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
