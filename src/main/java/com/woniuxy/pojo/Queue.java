package com.woniuxy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Queue {
    private Integer queueId;
    private Integer queueNum;
    private Integer aroomId;
}