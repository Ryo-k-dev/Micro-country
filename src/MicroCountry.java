import java.util.*;

public class MicroFront {
    static class Nation {
        String name;
        int money = 100;
        int food = 100;
        int soldiers = 50;
        int tech = 0;
        int approval = 50;

        Nation(String name) {
            this.name = name;
        }
