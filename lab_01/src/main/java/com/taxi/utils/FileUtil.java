
package com.taxi.utils;

import com.taxi.vehicles.Car;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileUtil {
    public static void saveCarsToFile(List<Car> cars, String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Car car : cars) {
                writer.write(car.toString());
                writer.newLine();
            }
        }
    }
}
