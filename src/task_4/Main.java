package task_4;

public class Main {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];

        computers[0] = new Computer("Intel", 1400.00,16,1);
        computers[1] = new Computer("AMD", 2700.00,32,3);
        computers[2] = new Computer("Atom", 1340.00,8,1);
        computers[3] = new Computer("NVidia", 3400.00,24,2);
        computers[4] = new Computer("Cortex", 700.00,4,1);


        System.out.println("Комп'ютера:");

        for(int i=0; i<computers.length; i++){
            System.out.println(computers[i].toString());
        }
    }
}