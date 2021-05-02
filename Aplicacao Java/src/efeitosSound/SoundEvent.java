package efeitosSound;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.ShortMessage;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum SoundEvent {

    NOTE_ON(ShortMessage.NOTE_ON),
    NOTE_OFF(ShortMessage.NOTE_OFF);

    @Getter
    @Setter
    private int event;

    public ShortMessage createShortMessage(int channel, int midiKey, int velocity) throws InvalidMidiDataException {
        ShortMessage message = new ShortMessage();
        try {
            message.setMessage(this.getEvent(), channel, midiKey, velocity);
        } catch (Exception ex) {

        }
        return message;
    }

    public MidiEvent createMidiEvent(MidiMessage message, long tick) {
        return new MidiEvent(message, tick);
    }
}
