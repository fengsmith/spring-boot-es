package demo.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @Author:shifengqiang
 * @Date:2020/7/30 4:31 下午
 */
@Document(indexName = "users")
@Data
public class User {
    @Id
    private Long id;
    private String name;
    private Integer age;
}
