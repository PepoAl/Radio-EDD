public class Radio implements IRadio {

    private boolean powerState;  // On or off
    private boolean isAM;        // AM or FM
    private float currentFrequency;  // Current frequency
    private float[] favFrequencies;  // Array to store favorite frequencies

    public Radio() {
        powerState = false;
        isAM = true;  // Default to AM
        currentFrequency = 530.0f;  // Default AM frequency
        favFrequencies = new float[12];
    }
    public boolean getState() {
        return powerState;
    }

    @Override
    public void tooglePowerOffOn() {
        powerState = !powerState;
        if (!powerState) {
            // If turning off, reset to default values
            isAM = true;
            currentFrequency = 530.0f;
        }
    }
    @Override
    public void toogleAMFM() {
        isAM = !isAM;
        // If switching to AM, set default AM frequency
        if (isAM) {
            currentFrequency = 530.0f;
        } else {
            // If switching to FM, set default FM frequency
            currentFrequency = 87.9f;
        }
    }

@Override
    public boolean getStateAMFM() {
        return isAM;
    }

@Override
    public void nextFrequency() {
        if (isAM) {
            // For AM, increment by 10, and wrap around if necessary
            currentFrequency += 10.0f;
            if (currentFrequency > 1610.0f) {
                currentFrequency = 530.0f;
            }
        } else {
            // For FM, increment by 0.2, and wrap around if necessary
            currentFrequency += 0.2f;
            if (currentFrequency > 107.9f) {
                currentFrequency = 87.9f;
            }
        }
    }

@Override
    public void previousFrequency() {
        if (isAM) {
            // For AM, decrement by 10, and wrap around if necessary
            currentFrequency -= 10.0f;
            if (currentFrequency < 530.0f) {
                currentFrequency = 1610.0f;
            }
        } else {
            // For FM, decrement by 0.2, and wrap around if necessary
            currentFrequency -= 0.2f;
            if (currentFrequency < 87.9f) {
                currentFrequency = 107.9f;
            }
        }
    }

@Override
    public float getCurrentFrequency() {
        return currentFrequency;
    }

@Override
    public void setFavFrequency(int button) {
        if (button >= 1 && button <= 12) {
            favFrequencies[button - 1] = currentFrequency;
        }
    }

@Override
    public float getFavFrequency(int button) {
        if (button >= 1 && button <= 12) {
            return favFrequencies[button - 1];
        }
        return 0.0f;
    }
}
