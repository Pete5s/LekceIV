import com.engeto.computer.Computer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Computer> computers = new ArrayList<>()
            computers.add(new Computer("abc", LocalDate.of(2020, 1,1) ,1.5));;
            computers.add(new Computer("yxz", LocalDate.of(2019, 1,1) ,1.5));;
            computers.add(new Computer("asd", LocalDate.of(2018, 1,1) ,1.5));;




               computers.sort();
    }
}