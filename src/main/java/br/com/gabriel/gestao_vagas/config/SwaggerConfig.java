package br.com.gabriel.gestao_vagas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityScheme;

//Essa classe serve para configurar o Swagger, que antes era definido na classe GestaoVagasApplication

@Configuration
public class SwaggerConfig {
    
    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI()
        .info(new Info().title("Gestão de Vagas").description("API responsavel pela gestão de vagas").version("1"))
        .schemaRequirement("jwt_auth", createsecurityScheme());
        //Atribnuir para todas as rotas
        // .addSecurityItem(new SecurityRequirement().addList("Bearer Authentication"))
        // .components(new Components().addSecuritySchemes("Bearer Authentication", createsecurityScheme()));
    }

    private SecurityScheme createsecurityScheme(){
        return new SecurityScheme().name("jwt_auth").type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT");
    }
}
