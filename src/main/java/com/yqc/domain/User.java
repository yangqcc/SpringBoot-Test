package com.yqc.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by yangqc on 2017/8/20
 */
@Data
@Document(collection = "user")
public class User {

    @Id
    private String id;

    private String name;

    private int age;

    private String favorite;
}
