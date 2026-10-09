package com.stockbit.alert.ui.detail.bottomsheet;

import android.content.Context;
import android.media.MediaPlayer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f45019a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f45020b;

    static {
    }

    public q(Context r2) {
        kotlin.jvm.internal.p.l(r2, "context");
        this.f45019a = r2;
        this.f45020b = new LinkedHashMap();
    }

    public static /* synthetic */ void a(kotlin.jvm.functions.a r02, MediaPlayer r1, q r2, AlertSound r3, MediaPlayer r4) {
        c(r02, r1, r2, r3, r4);
    }

    public static final void c(kotlin.jvm.functions.a r02, MediaPlayer r1, q r2, AlertSound r3, MediaPlayer r4) {
        if (r02 == null) goto L4;
        r02.invoke();
    L4:
        r1.release();
        r2.f45020b.remove(r3);
    }

    public final void b(final AlertSound r4, final kotlin.jvm.functions.a r5) {
        kotlin.jvm.internal.p.l(r4, "alertSound");
        MediaPlayer r02 = (MediaPlayer) this.f45020b.get(r4);
        if (r02 == null) goto L5;
        r02.release();
    L5:
        Map r03 = this.f45020b;
        final MediaPlayer r1 = MediaPlayer.create(this.f45019a, r4.getAudioResId());
        r1.setOnCompletionListener(new p(r5, r1, this, r4));
        r1.start();
        r03.put(r4, r1);
    }

    public final void d() {
        Iterator r02 = this.f45020b.values().iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        MediaPlayer r1 = (MediaPlayer) r02.next();
        r1.setOnCompletionListener(null);
        r1.release();
        goto L4
    L6:
        this.f45020b.clear();
    }
}
