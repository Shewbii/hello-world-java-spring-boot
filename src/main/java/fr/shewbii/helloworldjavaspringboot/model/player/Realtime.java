package fr.shewbii.helloworldjavaspringboot.model.player;

public record Realtime(
        String lobbyState,
        Boolean isOnline,
        Boolean isInGame,
        Boolean canJoin,
        Boolean partyFull,
        LegendEnum selectedLegend,
        StateEnum currentState,
        String currentStateAsText
) {
}
