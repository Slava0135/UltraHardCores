import arc.util.Timer;
import mindustry.Vars;
import mindustry.mod.Plugin;

public class UltraHardCores extends Plugin {

    @Override
    public void init() {
        Timer.schedule(() -> {
            var teams = Vars.state.teams.present;
            for (var team : teams) {
                for (var core : team.cores) {
                    core.health = Float.POSITIVE_INFINITY;
                }
            }
        }, 0, 0.1f);
    }

}
