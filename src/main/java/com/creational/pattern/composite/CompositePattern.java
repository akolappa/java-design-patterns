package com.creational.pattern.composite;

import java.util.*;
import java.util.function.Consumer;

public class CompositePattern {

    public static void main(String[] args) {
        Neuron neuron1 = new Neuron();
        Neuron neuron2 = new Neuron();
        NeuronLayer layer = new NeuronLayer();
        neuron1.connectTo(neuron2);
        neuron1.connectTo(layer);
        layer.connectTo(neuron1);
        layer.connectTo(neuron2);
    }
}

interface SomeNeuron extends Iterable<Neuron> {

    default void connectTo(SomeNeuron other){
        if (this == other) return;
        for(Neuron from : this)
        for(Neuron to : other){
            from.in.add(to);
            to.out.add(from);
        }

    }

}

class Neuron implements SomeNeuron {

    public List<Neuron> in = new ArrayList<>();
    public List<Neuron> out = new ArrayList<>();

    @Override
    public Iterator<Neuron> iterator() {
        return Collections.singleton(this).iterator();
    }
}

class NeuronLayer extends ArrayList<Neuron>
    implements SomeNeuron{

}
