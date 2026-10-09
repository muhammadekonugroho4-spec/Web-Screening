package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.view.View;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public final class a implements com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f43714a = null;

    static {
        f43714a = new a();
    }

    public a() {
    }

    @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.b
    public void a() {
    }

    @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.b
    public void b(View r2, kotlin.jvm.functions.a r3) {
        p.l(r2, "fullscreenView");
        p.l(r3, "exitFullscreen");
    }
}
