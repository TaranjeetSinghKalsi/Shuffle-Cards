package com.psl.gems.client;

import com.psl.gems.entity.JsonGenerator;
import com.psl.gems.entity.PackOfCards;

public class TestClient {
    public static void main(String[] args) {
        PackOfCards pack = new PackOfCards();
        pack.shuffle();
        JsonGenerator.generateJson(pack.getAllCards());
    }
}
