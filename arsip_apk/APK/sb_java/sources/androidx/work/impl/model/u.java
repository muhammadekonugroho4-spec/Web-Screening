package androidx.work.impl.model;

import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public interface u {
    void a(String r1);

    default void b(String r3, Set r4) {
        kotlin.jvm.internal.p.l(r3, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r4, Constants.KEY_TAGS);
        Iterator r42 = r4.iterator();
    L4:
        if (r42.hasNext() == false) goto L6;
        d(new WorkTag((String) r42.next(), r3));
        goto L4
    }

    List c(String r1);

    void d(WorkTag r1);
}
