package fr.shewbii.helloworldjavaspringboot.service;

import fr.shewbii.helloworldjavaspringboot.model.player.Player;
import fr.shewbii.helloworldjavaspringboot.model.player.PlayerPlatformEnum;
import fr.shewbii.helloworldjavaspringboot.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class PlayerService {

    @Value("${app.mozambiquehere.api-key}")
    private String API_KEY;

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player findByName(String username, Integer version, PlayerPlatformEnum platform) {
        Map<String, Object> params = new HashMap<>();
        params.put("player", username);
        params.put("version", version);
        params.put("auth", API_KEY);
        params.put("platform", platform.toString());
        return playerRepository.findByUsername(params);
    }

}
