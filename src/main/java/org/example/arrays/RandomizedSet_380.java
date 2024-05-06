package org.example.arrays;

import java.util.HashSet;
import java.util.Set;

class RandomizedSet {

    private final Set<Integer> set;

    //RandomizedSet() Initializes the RandomizedSet object.
    public RandomizedSet() {
        set = new HashSet<>();
    }

    // Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
    public boolean insert(int val) {
        return set.add(val);
    }

    //emoves an item val from the set if present. Returns true if the item was present, false otherwise.
    public boolean remove(int val) {
        return set.remove(val);
    }

    //Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.
    public int getRandom() {
        int min = 0;
        int max = set.size() - 1;
        int random = (int) (Math.random() * (max - min + 1));
        return (int) (set.toArray()[random]);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */