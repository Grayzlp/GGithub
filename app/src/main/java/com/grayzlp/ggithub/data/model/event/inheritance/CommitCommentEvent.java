package com.grayzlp.ggithub.data.model.event.inheritance;

import com.grayzlp.ggithub.data.model.event.BaseEvent;
import com.grayzlp.ggithub.data.model.comment.Comment;

/**
 * Models a CommitCommentEvent.
 */

public class CommitCommentEvent extends BaseEvent {

    public CommitCommentEventPayload payload;

    public static class CommitCommentEventPayload {
        public Comment comment;
    }

}
