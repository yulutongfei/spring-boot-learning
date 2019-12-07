package com.sunxu.springboot.unit1;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Nijp
 * @version 1.0.0
 * @Type ReplyDoctorQueryBO
 * @Desc 回复医生查询
 * @created 2019年2月23日 上午11:19:59
 */
public class ReplyUserQueryBO {

    /**
     * 会诊id
     */
    private Long groupId;

    /**
     * 查询用户ID
     */
    private Long userId;

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
