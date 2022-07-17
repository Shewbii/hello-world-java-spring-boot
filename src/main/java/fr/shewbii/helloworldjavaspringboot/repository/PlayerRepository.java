package fr.shewbii.helloworldjavaspringboot.repository;

import feign.Headers;
import fr.shewbii.helloworldjavaspringboot.model.player.Player;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(value = "playerFeign", url = "https://api.mozambiquehe.re/")
public interface PlayerRepository {

    @RequestMapping(method = RequestMethod.GET, value = "/bridge", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Headers("Content-Type: application/json")
    Player findByUsername(@SpringQueryMap Map<String, Object> queryMap);

}
