package day10;

// Interface for Smart Home Sensors
interface SmartHome {
    boolean detectSignal();
    String getStatus(String sensorId);
}

class TemperatureSensor implements SmartHome {
    public boolean detectSignal() {
        System.out.println("Temperature sensor checking...");
        return true;
    }

    public String getStatus(String sensorId) {
        return "Temperature Sensor ID: " + sensorId + " is working fine.";
    }
}


class MotionSensor implements SmartHome {
    public boolean detectSignal() {
        System.out.println("Motion sensor checking...");
        return true;
    }

    public String getStatus(String sensorId) {
        return "Motion Sensor ID: " + sensorId + " detected motion.";
    }
}


public class task5 {
    public static void main(String[] args) {
        SmartHome sensor1 = new TemperatureSensor();
        sensor1.detectSignal();
        System.out.println(sensor1.getStatus("KLU5051"));

        SmartHome sensor2 = new MotionSensor();
        sensor2.detectSignal();
        System.out.println(sensor2.getStatus("KLU5052"));
    }
}
