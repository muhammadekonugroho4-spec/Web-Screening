package com.clevertap.android.sdk.video.inbox;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSource;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Util;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class a implements com.clevertap.android.sdk.video.b {

    /* renamed from: a, reason: collision with root package name */
    public StyledPlayerView f35007a;

    /* renamed from: b, reason: collision with root package name */
    public ExoPlayer f35008b;

    /* renamed from: com.clevertap.android.sdk.video.inbox.a$a, reason: collision with other inner class name */
    public static final class C0358a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.functions.a f35009a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f35010b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ExoPlayer f35011c;
        public final /* synthetic */ kotlin.jvm.functions.a d;

        public C0358a(kotlin.jvm.functions.a r1, a r2, ExoPlayer r3, kotlin.jvm.functions.a r4) {
            this.f35009a = r1;
            this.f35010b = r2;
            this.f35011c = r3;
            this.d = r4;
        }
    }

    public a() {
    }

    @Override // com.clevertap.android.sdk.video.b
    public View a() {
        View r02 = this.f35007a;
        p.i(r02);
        return r02;
    }

    @Override // com.clevertap.android.sdk.video.b
    public float b() {
        ExoPlayer r02 = this.f35008b;
        if (r02 != null) goto L5;
        return 0.0f;
    L5:
        return r02.getVolume();
    }

    @Override // com.clevertap.android.sdk.video.b
    public void c() {
        ExoPlayer r02 = this.f35008b;
        if (r02 == null) goto L12;
        float r1 = b();
        if (r1 <= 0.0f) goto L9;
        r02.setVolume(0.0f);
        return;
    L9:
        if (r1 != 0.0f) goto L13;
        r02.setVolume(1.0f);
        return;
    L13:
        return;
    }

    @Override // com.clevertap.android.sdk.video.b
    public void d(boolean r2) {
        ExoPlayer r02 = this.f35008b;
        if (r02 == null) goto L6;
        r02.setPlayWhenReady(r2);
        return;
    }

    @Override // com.clevertap.android.sdk.video.b
    public void e(Context r3, kotlin.jvm.functions.a r4, kotlin.jvm.functions.a r5) {
        p.l(r3, "context");
        p.l(r4, "buffering");
        p.l(r5, "playerReady");
        if (this.f35008b == null) goto L5;
        return;
    L5:
        TrackSelector r1 = new DefaultTrackSelector(r3, new AdaptiveTrackSelection.Factory());
        ExoPlayer r32 = new ExoPlayer.Builder(r3).setTrackSelector(r1).build();
        r32.setVolume(0.0f);
        r32.addListener(new C0358a(r4, this, r32, r5));
        this.f35008b = r32;
    }

    @Override // com.clevertap.android.sdk.video.b
    public void f(Context r4, kotlin.jvm.functions.a r5) {
        p.l(r4, "context");
        p.l(r5, "artworkAsset");
        if (this.f35007a == null) goto L5;
        return;
    L5:
        StyledPlayerView r02 = new StyledPlayerView(r4);
        r02.setBackgroundColor(0);
        if (r4.getResources().getConfiguration().orientation != 2) goto L8;
        int r42 = 3;
    L9:
        r02.setResizeMode(r42);
        r02.setUseArtwork(true);
        r02.setDefaultArtwork((Drawable) r5.invoke());
        r02.setUseController(true);
        r02.setControllerAutoShow(false);
        r02.setPlayer(this.f35008b);
        this.f35007a = r02;
        return;
    L8:
        r42 = 0;
        goto L9
    }

    @Override // com.clevertap.android.sdk.video.b
    public void g(Context r6, String r7, boolean r8, boolean r9) {
        p.l(r6, "ctx");
        p.l(r7, "uriString");
        StyledPlayerView r02 = this.f35007a;
        if (r02 == null) goto L5;
        r02.requestFocus();
        r02.setShowBuffering(0);
    L5:
        ExoPlayer r03 = this.f35008b;
        if (r03 == null) goto L17;
        TransferListener r2 = new DefaultBandwidthMeter.Builder(r6).build();
        p.k(r2, "build(...)");
        String r3 = Util.getUserAgent(r6, r6.getPackageName());
        p.k(r3, "getUserAgent(...)");
        MediaItem r72 = MediaItem.fromUri(r7);
        p.k(r72, "fromUri(...)");
        DataSource.Factory r22 = new DefaultHttpDataSource.Factory().setUserAgent(r3).setTransferListener(r2);
        p.k(r22, "setTransferListener(...)");
        MediaSource r62 = new HlsMediaSource.Factory(new DefaultDataSource.Factory(r6, r22)).createMediaSource(r72);
        p.k(r62, "createMediaSource(...)");
        r03.setMediaSource(r62);
        r03.prepare();
        if (r8 == false) goto L14;
        StyledPlayerView r63 = this.f35007a;
        if (r63 == null) goto L12;
        r63.showController();
    L12:
        r03.setPlayWhenReady(false);
        r03.setVolume(1.0f);
        return;
    L14:
        if (r9 == false) goto L18;
        r03.setPlayWhenReady(true);
        r03.setVolume(b());
        return;
    L18:
        return;
    }

    @Override // com.clevertap.android.sdk.video.b
    public void pause() {
        ExoPlayer r02 = this.f35008b;
        if (r02 == null) goto L5;
        r02.stop();
        r02.release();
    L5:
        this.f35008b = null;
        this.f35007a = null;
    }
}
