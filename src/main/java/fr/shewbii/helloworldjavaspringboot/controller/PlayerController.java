package fr.shewbii.helloworldjavaspringboot.controller;

import fr.shewbii.helloworldjavaspringboot.model.player.Player;
import fr.shewbii.helloworldjavaspringboot.model.player.PlayerPlatformEnum;
import fr.shewbii.helloworldjavaspringboot.service.PlayerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/player")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/{username}")
    public Player findByUsername(@PathVariable String username, @RequestParam PlayerPlatformEnum platform) {
        return playerService.findByName(username, 4, platform);
    }

}
