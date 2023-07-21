package khorsun.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private  RapMusic rapMusic;
    private  RockMusic rockMusic;
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RapMusic rapMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rapMusic = rapMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic(){
        return classicalMusic.getSong();
    }





    public void doMyInit(){
        System.out.println("Initialization");
    }
    public void doMyDestroy(){
        System.out.println("Do destroy");
    }
}
