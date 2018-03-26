package pl.ttpsc.solid.dip.weathertracker.solution;

public class Phone implements Device {

  @Override
  public void printWeatherAlert(String weatherConditions) {
    System.out.println("It is " + weatherConditions);
  }
}
