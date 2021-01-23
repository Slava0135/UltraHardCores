import arc.struct.Seq;
import arc.util.Timer;
import mindustry.Vars;
import mindustry.game.Teams.*;
import mindustry.gen.Building;
import mindustry.mod.Plugin;

public class UltraHardCores extends Plugin {

    @Override
    public void init() {
        Timer.schedule(() -> {
            Seq<TeamData> teams = Vars.state.teams.present;
            for (TeamData team : teams) {
                for (Building core : team.cores) {
                    core.health = Float.POSITIVE_INFINITY;
                }
            }
        }, 0, 1f);
    }

}
