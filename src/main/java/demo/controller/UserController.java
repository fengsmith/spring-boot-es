package demo.controller;

import demo.document.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:shifengqiang
 * @Date:2020/7/30 5:50 下午
 */
@RestController
public class UserController {
    @Autowired
    private ElasticsearchRestTemplate elasticsearchTemplate;

    @RequestMapping("/query")
    @ResponseBody
    public User queryUser() {
        User user = elasticsearchTemplate
                .get("3", User.class);
        return user;
    }
    @RequestMapping("/save")
    @ResponseBody
    public User saveUser() {
        User user = new User();
        user.setId(3L);
        user.setAge(3223);
        user.setName("shifengqiang3");


        IndexCoordinates indexOperations = IndexCoordinates.of("users");

        IndexQuery indexQuery = new IndexQueryBuilder()
                .withId("3")
                .withObject(user)
                .build();
        String documentId = elasticsearchTemplate.index(indexQuery, indexOperations);

        return user;
    }
}
