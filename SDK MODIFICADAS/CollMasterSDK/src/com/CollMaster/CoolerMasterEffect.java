package com.CollMaster;

/**
 * Coolermaster default effects to set
 */
public enum CoolerMasterEffect {
    EFF_FULL_ON(0),
    EFF_BREATH(1),
    EFF_BREATH_CYCLE(2),
    EFF_SINGLE(3),
    EFF_WAVE(4),
    EFF_RIPPLE(5),
    EFF_CROSS(6),
    EFF_RAIN(7),
    EFF_STAR(8),
    EFF_SNAKE(9),
    EFF_REC(10),
    EFF_SPECTRUM(11),
    EFF_RAPID_FIRE(12),
    EFF_INDICATOR(13),
    EFF_FIRE_BALL(14),
    EFF_WATER_RIPPLE(15),
    EFF_REACTIVE_PUNCH(16),
    EFF_SNOWING(17),
    EFF_HEART_BEAT(18),
    EFF_REACTIVE_TORNADO(19),
    EFF_MULTI_1(0xE0), 
    EFF_MULTI_2(0xE1),
    EFF_MULTI_3(0xE2),
    EFF_MULTI_4(0xE3),
    EFF_OFF(0xFE);

    private int index;

    CoolerMasterEffect(int index) {
        this.index = index;
    }

    protected int getIndex() {
        return this.index;
    }
}
