package khorsun.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music{

    private List<String> rockSongs= new ArrayList<>();

    @Override
    public String getSong() {
        Random random=new Random();
        for (int i = 0; i < 3; i++) {
            rockSongs.add("rock song "+i);

        }

        return rockSongs.get(random.nextInt(3));
    }
}
