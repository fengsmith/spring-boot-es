package demo.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.config.ElasticsearchConfigurationSupport;

/**
 * @Author:shifengqiang
 * @Date:2020/7/30 3:59 下午
 */
//public class ElasticSearchConfigBackup extends ElasticsearchConfigurationSupport {
//    public ElasticSearchConfigBackup() {
//        System.out.println("ElasticSearchConfig() called");
//    }
//
//    @Bean
//    public RestHighLevelClient elasticsearchClient() {
//        System.out.println("elasticsearchClient() called");
//        ClientConfiguration.ClientConfigurationBuilderWithRequiredEndpoint builder = ClientConfiguration.builder();
//        final ClientConfiguration clientConfiguration = ClientConfiguration.builder()
//                .connectedTo("localhost:9200")
//                .build();
//
//        return RestClients.create(clientConfiguration).rest();
//    }
//}
public class ElasticSearchConfigBackup {

}
