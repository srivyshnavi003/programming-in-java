public class ShortestLoop {
    public static void main(String[] args) {
        long startTime, endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 1; i++) {
            // Loop body intentionally left empty
        }
        endTime = System.nanoTime();
        long forLoopTime = endTime - startTime;

        
        startTime = System.nanoTime();
        while (System.nanoTime() == startTime) {
            // Loop body intentionally left empty
        }
        long whileLoopTime = System.nanoTime() - startTime;

        
        startTime = System.nanoTime();
        do {
            
        } while (System.nanoTime() == startTime);
        long doWhileLoopTime = System.nanoTime() - startTime;

        
        String shortestPath;
        if (forLoopTime < whileLoopTime && forLoopTime < doWhileLoopTime) {
            shortestPath = "for loop";
        } else if (whileLoopTime < forLoopTime && whileLoopTime < doWhileLoopTime) {
            shortestPath = "while loop";
        } else {
            shortestPath = "do-while loop";
        }

       
        System.out.println("The shortest path first is: " + shortestPath);
    }
}