package khorsun.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component

public class MusicPlayer {
    private Music music1;
    private Music music2;

    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(Enum<Genre> genreEnum){
        if (genreEnum==Genre.ROCK)
        {
             return music2.getSong();
        } else if (genreEnum==Genre.CLASSICAL) {
             return music1.getSong();
        }else {
            return "Wrong genre ";
        }


    }





    public void doMyInit(){
        System.out.println("Initialization");
    }

    public void doMyDestroy(){
        System.out.println("Do destroy");
    }
}
