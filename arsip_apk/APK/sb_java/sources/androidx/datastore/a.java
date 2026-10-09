package androidx.datastore;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class a {
    public static final File a(Context r2, String r3) {
        p.l(r2, "<this>");
        p.l(r3, "fileName");
        return new File(r2.getApplicationContext().getFilesDir(), p.u("datastore/", r3));
    }
}
