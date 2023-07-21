package khorsun.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music{
    private List<String> classicalSongs= new ArrayList<>();

    @Override
    public String getSong() {
        Random random=new Random();
        for (int i = 0; i < 3; i++) {
            classicalSongs.add("Classical song"+i);

        }

        return classicalSongs.get(random.nextInt(3));
    }
}
