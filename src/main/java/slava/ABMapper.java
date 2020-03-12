package slava;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
@Mapper
public interface ABMapper {
    @Mappings({
            @Mapping(source = "a", target = "b")
    })
    B OAuth2AccessTokenToOAuth2Token(A a);


}
