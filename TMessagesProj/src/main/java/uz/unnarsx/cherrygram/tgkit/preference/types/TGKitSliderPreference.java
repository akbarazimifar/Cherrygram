package uz.unnarsx.cherrygram.tgkit.preference.types;

import androidx.annotation.Nullable;

import uz.unnarsx.cherrygram.tgkit.preference.TGKitPreference;

public class TGKitSliderPreference extends TGKitPreference {
    public TGSLContract contract;

    @Nullable
    public String summary;

    @Override
    public TGPType getType() {
        return TGPType.SLIDER;
    }

    public interface TGSLContract {
        void setValue(int value);

        int getPreferenceValue();

        int getMin();

        int getMax();
    }
}
