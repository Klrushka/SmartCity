package com.smartcity.smartcity.requests.select;

import com.smartcity.smartcity.requests.interfaces.SelectRequest;

public class CommentSelectRequest implements SelectRequest {


    /**
     * [0] - topicId
     * @param params
     * @return
     */
    @Override
    public String getRequest(String... params) {
        StringBuffer buffer = new StringBuffer();

        buffer
                .append("SELECT * FROM comments WHERE topic_id = ")
                .append(params[0]);


        return buffer.toString();

    }
}
