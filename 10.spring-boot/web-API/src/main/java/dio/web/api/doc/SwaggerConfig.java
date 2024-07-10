package dio.web.api.doc;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
    private Contact contato() {
        return new Contact(
            "Seu nome",
            "https://www.seusite.com.br",
            "voce@seusite.com.br"
        );
    }

    private ApiInfoBuilder informacoesApi() {
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();

        apiInfoBuilder.title("Title - Rest API");
        apiInfoBuilder.description("API exemplo de uso de Springboot REST API");
        apiInfoBuilder.version("1.8");
        apiInfoBuilder.termsOfServiceUrl("Termo de uso: Open Source");
        apiInfoBuilder.license("Licença - Sua empresa");
        apiInfoBuilder.licenseUrl("http://www.seusitw.com.br");
        apiInfoBuilder.contact(this.contato());

        return apiInfoBuilder;
    }

    @Bean
    public Docket detalheApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        
        docket
            .select()
            .apis(RequestHandlerSelectors.basePackage("dio.web.api.controller"))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(this.informacoesApi().build())
            .consumes(new HashSet<String>(Arrays.asList("aplication/json")))
            .produces(new HashSet<String>(Arrays.asList("aplication/json")));

        return docket;
    }
}
