package com.github.kil1s.other.params.model;

import com.github.kil1s.other.map.entry.MapEntry;
import com.github.kil1s.other.map.map.BaseMap;

import java.util.List;

public abstract class BaseParams<K, O, V, L extends Iterable, E extends MapEntry> extends BaseMap<K, V, List<V>, L, E> {
    public abstract boolean gotOption(O option);
    public abstract List<O> getOptions();
    public abstract void remove(O option);
    public abstract void add(O option);
}
