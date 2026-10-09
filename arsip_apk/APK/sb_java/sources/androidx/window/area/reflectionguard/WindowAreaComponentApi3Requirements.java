package androidx.window.area.reflectionguard;

import android.app.Activity;
import android.util.DisplayMetrics;
import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import androidx.window.extensions.area.ExtensionWindowAreaStatus;
import androidx.window.extensions.core.util.function.Consumer;

/* loaded from: classes4.dex */
public interface WindowAreaComponentApi3Requirements {
    void addRearDisplayPresentationStatusListener(Consumer<ExtensionWindowAreaStatus> r1);

    void addRearDisplayStatusListener(Consumer<Integer> r1);

    void endRearDisplayPresentationSession();

    void endRearDisplaySession();

    DisplayMetrics getRearDisplayMetrics();

    ExtensionWindowAreaPresentation getRearDisplayPresentation();

    void removeRearDisplayPresentationStatusListener(Consumer<ExtensionWindowAreaStatus> r1);

    void removeRearDisplayStatusListener(Consumer<Integer> r1);

    void startRearDisplayPresentationSession(Activity r1, Consumer<Integer> r2);

    void startRearDisplaySession(Activity r1, Consumer<Integer> r2);
}
