package core.practice.sber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

class Race {

    private ArrayList<Stage> stages;
    private CountDownLatch preparationLatch;
    private CountDownLatch finishLatch;
    private AtomicBoolean winnerFound;

    public Race( Stage... stages ) {
        this.stages = new ArrayList<>( Arrays.asList( stages ) );
        this.preparationLatch = new CountDownLatch( Main.CARS_COUNT );
        this.finishLatch = new CountDownLatch( Main.CARS_COUNT );
        this.winnerFound = new AtomicBoolean( false );
    }

    public ArrayList<Stage> getStages() {
        return stages;
    }

    public CountDownLatch getPreparationLatch() {
        return preparationLatch;
    }

    public CountDownLatch getFinishLatch() {
        return finishLatch;
    }

    public AtomicBoolean getWinnerFound() {
        return winnerFound;
    }
}