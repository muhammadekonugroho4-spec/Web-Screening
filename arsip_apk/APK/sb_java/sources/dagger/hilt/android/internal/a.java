package dagger.hilt.android.internal;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes2.dex */
public abstract class a {
    public static Application a(Context r3) {
        if ((r3 instanceof Application) == true) goto L5;
        Context r02 = r3;
    L8:
        if ((r02 instanceof ContextWrapper) == false) goto L14;
        r02 = ((ContextWrapper) r02).getBaseContext();
        if ((r02 instanceof Application) == false) goto L8;
        return (Application) r02;
    L14:
        throw new IllegalStateException("Could not find an Application in the given context: " + r3);
    L5:
        return (Application) r3;
    }
}
