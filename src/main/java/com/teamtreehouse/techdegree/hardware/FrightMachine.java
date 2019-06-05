package com.teamtreehouse.techdegree.hardware;

import com.example.accessory.Accessory;
import com.example.accessory.Horn;
import com.example.accessory.Strobe;
import com.example.motion.MotionDetector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrightMachine extends MotionDetector {

    private Map<String, Accessory> accessories = new HashMap<>();

    public void addAccessory(String name, Accessory accessory) {
        accessories.put(name, accessory);
    }
    
    @Override
    public void onMotionDetected() {
        for (Accessory accessory : accessories.values()) {
            accessory.activate();
        }
    }
}
