package thread;

public class VotingRunnable implements Runnable{

    @Override
    public synchronized void run() {
        for ( int i= 0  ; i < 1000 ;i ++){
            TestRaceCondition.vote();
        }
    }

}
