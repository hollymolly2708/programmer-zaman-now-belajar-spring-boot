package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data.cyclic;

public class CyclicA {
    private CyclicB cyclicB;

    public CyclicA(CyclicB cyclicB) {
        this.cyclicB = cyclicB;
    }

    public CyclicB getCyclicB() {
        return cyclicB;
    }

    public void setCyclicB(CyclicB cyclicB) {
        this.cyclicB = cyclicB;
    }
}
