package com.prosky.springhomework.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import javax.sound.midi.MidiSystem;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@SessionScope
public class CartService {
    private final Set<Integer> items = new HashSet<>();
    public void add(int ... ids) {
        for (int id : ids) {
            items.add(id);
        }
    }

    public Set<Integer> getItems() {
        return items;
    }

}
