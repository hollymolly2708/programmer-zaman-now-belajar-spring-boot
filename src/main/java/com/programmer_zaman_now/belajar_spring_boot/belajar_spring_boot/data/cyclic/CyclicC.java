package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data.cyclic;


public class CyclicC {
    private CyclicA cyclicA;

    public CyclicC(CyclicA cyclicA) {
        this.cyclicA = cyclicA;
    }

    public CyclicA getCyclicA() {
        return cyclicA;
    }

    public void setCyclicA(CyclicA cyclicA) {
        this.cyclicA = cyclicA;
    }
}
