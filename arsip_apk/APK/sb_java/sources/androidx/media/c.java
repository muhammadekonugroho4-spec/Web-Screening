package androidx.media;

import android.content.Context;
import android.service.media.MediaBrowserService;
import androidx.media.b;

/* loaded from: classes4.dex */
public abstract class c extends b.C0214b {
    public c(Context r1, d r2) {
        super(r1, r2);
    }

    @Override // android.service.media.MediaBrowserService
    public void onLoadItem(String r3, MediaBrowserService.Result r4) {
        ((d) this.f25898a).e(r3, new b.c(r4));
    }
}
