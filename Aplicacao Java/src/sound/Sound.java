package sound;

import org.apache.commons.lang3.builder.HashCodeBuilder;
public class Sound {

	private Note note;
	private int octave;
        public Sound(double frequency) {
            this.setNote(Note.get(frequency));
            this.setOctave(this.getNote().getOctave(frequency));
        }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public int getOctave() {
        return octave;
    }

    public void setOctave(int octave) {
        this.octave = octave;
    }

	
	@Override
	public boolean equals(Object object) {
		
		if (object == null) {
			return false;
		}
		
		if (this == object) {
			return true;
		}
		
		if (!this.getClass().equals(object.getClass())) {
			return false;
		}
		
		Sound other = (Sound)object;
		
		return
			this.getNote().toString().equals(other.getNote().toString()) &&
			this.getOctave() == other.getOctave();
	}
	
	@Override
	public int hashCode() {
		return
			new HashCodeBuilder(3, 7)
				.append(this.getNote().toString())
				.append(this.getOctave())
					.toHashCode();
	}
	
	@Override
	public String toString() {
		return this.getNote().toString(this.getOctave());
	}

	public int getMidiNote() {
		return this.getNote().getFirstMidiKey() + (12 * this.getOctave());
	}
}
