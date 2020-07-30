package demo.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.ElasticsearchConfigurationSupport;

/**
 * @Author:shifengqiang
 * @Date:2020/7/30 3:59 下午
 */
@Configuration
public class ElasticSearchConfig extends ElasticsearchConfigurationSupport {
    @Value("${es_host}")
    private String esHost;

    @Value("${es_port}")
    private String esPort;

    @Bean
    public RestHighLevelClient elasticsearchClient() {
        ClientConfiguration.ClientConfigurationBuilderWithRequiredEndpoint builder = ClientConfiguration.builder();
        final ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTo(esHost + ":" + esPort)
                .build();

        return RestClients.create(clientConfiguration).rest();
    }
}
