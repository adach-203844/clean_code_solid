package pl.ttpsc.solid.dip.weathertracker.solution;

import java.util.ArrayList;
import java.util.List;

public class WeatherTracker {

  private String currentConditions;
  private final List<Device> devices = new ArrayList<>();

  public void addNewDevice(Device device) {
    this.devices.add(device);
  }

  public void setCurrentConditions(String conditions) {
    this.currentConditions = conditions;
    this.notifyDevices();
  }

  private void notifyDevices() {
    for (Device device : this.devices) {
      device.printWeatherAlert(this.currentConditions);
    }
  }
}
