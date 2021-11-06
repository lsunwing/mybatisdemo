package com.liuwei.mybatisdemo.test;

import java.util.Objects;

public class MapObj {

    String s;

    public MapObj(String s) {
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MapObj mapObj = (MapObj) o;
        return Objects.equals(s, mapObj.s);
    }

    @Override
    public int hashCode() {
        return 37;
    }
}
