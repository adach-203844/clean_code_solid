package pl.ttpsc.solid.ocp.usa.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class USASpeedLimitFines {

  private final Map<String, Integer> speedLimits = new HashMap<>();
  private final Map<String, Function<Integer, Double>> fineFunctions = new HashMap<>();

  public USASpeedLimitFines() {
    speedLimits.put("SC", 0);
    fineFunctions.put("SC", (Integer overLimit) -> 1.0); // example function
    speedLimits.put("AL", 0);
    fineFunctions.put("AL", (Integer overLimit) -> 2.0); // example function
    speedLimits.put("GA", 0);
    fineFunctions.put("AL", (Integer overLimit) -> 3.0); // example function
  }

  public void addNewState(String stateCode, int limit, Function<Integer, Double> fineFunction) {
    speedLimits.put(stateCode, limit);
    fineFunctions.put(stateCode, fineFunction);
  }

  public double calcualateFine(String stateCode, int speed) {

    Integer speedLimit = speedLimits.get(stateCode);
    if (speedLimit == null) {
      throw new IllegalArgumentException("No such state.");
    }
    if (speed > speedLimit) {
      return fineFunctions.get(stateCode).apply(speedLimit - speed);
    }
    return 0.0;
  }
}

