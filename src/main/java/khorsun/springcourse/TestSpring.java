package khorsun.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer1 = classPathXmlApplicationContext.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = classPathXmlApplicationContext.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer1.playSong();
        musicPlayer2.playSong();

        boolean comparison=musicPlayer1==musicPlayer2;
        System.out.println(comparison);
        musicPlayer1.setVolume(10);
        System.out.println(musicPlayer2.getVolume());




        classPathXmlApplicationContext.close();


    }
}
