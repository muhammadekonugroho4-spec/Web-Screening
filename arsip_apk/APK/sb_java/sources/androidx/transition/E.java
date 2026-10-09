package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public class E {

    /* renamed from: a, reason: collision with root package name */
    public final Map f28319a;

    /* renamed from: b, reason: collision with root package name */
    public View f28320b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f28321c;

    public E(View r2) {
        this.f28319a = new HashMap();
        this.f28321c = new ArrayList();
        this.f28320b = r2;
    }

    public boolean equals(Object r3) {
        if ((r3 instanceof E) == false) goto L10;
        E r32 = (E) r3;
        if (this.f28320b == r32.f28320b) goto L7;
        return false;
    L7:
        if (this.f28319a.equals(r32.f28319a) == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public int hashCode() {
        return (this.f28320b.hashCode() * 31) + this.f28319a.hashCode();
    }

    public String toString() {
        String r1 = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f28320b + "\n") + "    values:";
        Iterator r2 = this.f28319a.keySet().iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        String r3 = (String) r2.next();
        r1 = r1 + "    " + r3 + ": " + this.f28319a.get(r3) + "\n";
        goto L4
    L6:
        return r1;
    }
}
