package ai.reclaim.interview;

public interface Job {
    String getUserId();

    default void execute() {
        System.out.println("Doing work!!!");
    }
}
