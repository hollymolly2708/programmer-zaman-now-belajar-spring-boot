package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.data.cyclic;

public class CyclicB {
    private CyclicC cyclicC;

    public CyclicB(CyclicC cyclicC){
        this.cyclicC = cyclicC;
    }
    public CyclicC getCyclicC() {
        return cyclicC;
    }

    public void setCyclicC(CyclicC cyclicC) {
        this.cyclicC = cyclicC;
    }
}
