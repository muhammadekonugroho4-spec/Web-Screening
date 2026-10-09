package androidx.savedstate;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class e {
    public static final Void a(String r3) {
        p.l(r3, Constants.KEY_KEY);
        throw new IllegalArgumentException("No valid saved state was found for the key '" + r3 + "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly.");
    }
}
