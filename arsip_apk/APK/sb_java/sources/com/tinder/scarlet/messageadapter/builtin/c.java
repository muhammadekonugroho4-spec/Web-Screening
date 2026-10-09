package com.tinder.scarlet.messageadapter.builtin;

import com.google.firebase.messaging.Constants;
import com.tinder.scarlet.d;
import com.tinder.scarlet.e;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c implements e {
    public c() {
    }

    @Override // com.tinder.scarlet.e
    public /* bridge */ /* synthetic */ d a(Object r1) {
        return d((String) r1);
    }

    @Override // com.tinder.scarlet.e
    public /* bridge */ /* synthetic */ Object b(d r1) {
        return c(r1);
    }

    public String c(d r2) {
        p.l(r2, "message");
        if ((r2 instanceof d.b) == false) goto L7;
        return ((d.b) r2).a();
    L7:
        throw new IllegalArgumentException("This Message Adapter only supports text Messages");
    }

    public d d(String r2) {
        p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return new d.b(r2);
    }
}
