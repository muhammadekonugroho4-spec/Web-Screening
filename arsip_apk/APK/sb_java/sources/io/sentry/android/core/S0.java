package io.sentry.android.core;

import io.sentry.AbstractC11507a3;

/* loaded from: classes3.dex */
public final class S0 extends AbstractC11507a3 {
    public S0() {
    }

    @Override // io.sentry.AbstractC11507a3
    public void f(boolean r1) {
        super.f(r1);
        if (r1 == false) goto L6;
        i();
        return;
    L6:
        j();
    }

    @Override // io.sentry.AbstractC11507a3
    public void h() {
    }

    public final void i() {
        a("android.webkit.WebView");
        a("android.widget.VideoView");
        a("androidx.camera.view.PreviewView");
        a("androidx.media3.ui.PlayerView");
        a("com.google.android.exoplayer2.ui.PlayerView");
        a("com.google.android.exoplayer2.ui.StyledPlayerView");
    }

    public final void j() {
        b().remove("android.webkit.WebView");
        b().remove("android.widget.VideoView");
        b().remove("androidx.camera.view.PreviewView");
        b().remove("androidx.media3.ui.PlayerView");
        b().remove("com.google.android.exoplayer2.ui.PlayerView");
        b().remove("com.google.android.exoplayer2.ui.StyledPlayerView");
    }
}
