package khorsun.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Music classicalMusic = classPathXmlApplicationContext.getBean("classicalMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(List.of(classicalMusic));
        musicPlayer.playSong();

        Music rapMusic = classPathXmlApplicationContext.getBean("rapMusic", Music.class);
        MusicPlayer musicPlayer1 = new MusicPlayer(List.of(rapMusic));
        musicPlayer1.playSong();


        classPathXmlApplicationContext.close();


    }
}
