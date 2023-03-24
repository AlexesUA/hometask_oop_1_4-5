package task_4;

public class Computer {
    String nameProcessor;
    double frequensyProcessor;

    int volumeRAM;
    int volemeHDD;

    public Computer(String nameProcessor, double frequensyProcessor, int volumeRAM, int volemeHDD){
        this.nameProcessor = nameProcessor;
        this.frequensyProcessor = frequensyProcessor;
        this.volumeRAM = volumeRAM;
        this.volemeHDD = volemeHDD;
    }

    public String getNameProcessor(){
        return nameProcessor;
    }

    public double getFrequensyProcessor() {
        return frequensyProcessor;
    }

    public int getVolumeRAM() {
        return volumeRAM;
    }

    public int getVolemeHDD() {
        return volemeHDD;
    }

    public String toString() {
        return String.format("Комп'ютер на базі процессора %1$s з частотою %2$.2fГгц, " +
                "оперативної пам'яті %3$sGB та ємністю жесткого диску %4$sTB %n",
                nameProcessor, frequensyProcessor, volumeRAM, volemeHDD);
    }
}
