package pl.ttpsc.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class IntegersCounter {

  private Map<Integer, Integer> integersCounts = new HashMap<>();
  private int minInteger = Integer.MAX_VALUE;
  private int maxInteger = Integer.MIN_VALUE;
  private double weightedAverage;

  public IntegersCounter(List<Integer> integers) {
    for (Integer integer : integers) {
      processInteger(integer);
    }
    calculateWeightedAverage();
  }

  private void processInteger(Integer integer) {
    integersCounts.merge(integer, 1, Integer::sum);
    updateMin(integer);
    updateMax(integer);
  }

  private void updateMin(Integer integer) {
    minInteger = Math.min(minInteger, integer);
  }

  private void updateMax(Integer integer) {
    maxInteger = Math.max(maxInteger, integer);
  }

  private void calculateWeightedAverage() {
    double weightedValuesSum = 0;
    double weightsSum = 0;
    for (Entry<Integer, Integer> u : integersCounts.entrySet()) {
      weightsSum += u.getValue();
      weightedValuesSum += u.getKey() * u.getValue();
    }
    weightedAverage = weightedValuesSum / weightsSum;
  }


  public int getIntegerCount(int integer) {
    return integersCounts.getOrDefault(integer, 0);
  }

  public int getMinInteger() {
    return minInteger;
  }

  public int getMaxInteger() {
    return maxInteger;
  }

  public double getWeightedAverage() {
    return weightedAverage;
  }
}