package androidx.emoji2.text;

import android.os.Build;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class k {

    public static class a {
        public static Set a() {
            return b.a();
        }
    }

    public static class b {
        public static Set a() {
            Object r02 = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);     // Catch: Throwable -> L13
            if (r02 == null) goto L5;
            Set r03 = (Set) r02;     // Catch: Throwable -> L13
            Iterator r1 = r03.iterator();     // Catch: Throwable -> L13
        L8:
            if (r1.hasNext() == false) goto L19;
            if ((r1.next() instanceof int[]) == true) goto L8;
            return Collections.EMPTY_SET;
        L19:
            return r03;
        L5:
            return Collections.EMPTY_SET;
        L14:
            return Collections.EMPTY_SET;
        }
    }

    public static Set a() {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return a.a();
    L7:
        return b.a();
    }
}
