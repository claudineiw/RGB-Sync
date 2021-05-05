package efeitosSound;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Note {

    G_SHARP("G#", 25.96, 20),
    A("A", 27.50, 21),
    A_SHARP("A#", 29.14, 22),
    B("B", 30.87, 23),
    C("C", 16.35, 12),
    C_SHARP("C#", 17.32, 13),
    D("D", 18.35, 14),
    D_SHARP("D#", 19.45, 15),
    E("E", 20.60, 16),
    F("F", 21.83, 17),
    F_SHARP("F#", 23.12, 18),
    G("G", 24.50, 19);

    private static final double LOG_2_BASE_10 = Math.log10(2);
    public static double valor = 0;
    private String symbol;
    private double firstFrequency;
    private int firstMidiKey;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getFirstFrequency() {
        return firstFrequency;
    }

    public void setFirstFrequency(double firstFrequency) {
        this.firstFrequency = firstFrequency;
    }

    public int getFirstMidiKey() {
        return firstMidiKey;
    }

    public void setFirstMidiKey(int firstMidiKey) {
        this.firstMidiKey = firstMidiKey;
    }

    public int getOctave(double frequency) {
        return (int) Math.round(Math.log10(frequency / this.getFirstFrequency()) / Note.LOG_2_BASE_10);
    }

    public static Note get(double frequency) {
        double value = Math.round(12.0 * Math.log10(frequency / 440) / Note.LOG_2_BASE_10 + 49.0);
        if (value < 100) {
            valor = value;
        } else {
            valor = 99;
        }

        int index = Math.floorMod((int) value, 12);
        return Note.values()[index];
    }

    @Override
    public String toString() {
        return this.getSymbol();
    }

    public String toString(int octave) {
        return this.toString() + octave;
    }
}
