package io.sentry.android.replay.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f176033a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaMuxer f176034b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f176035c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f176036e;

    /* renamed from: f, reason: collision with root package name */
    public long f176037f;

    static {
    }

    public b(String r4, float r5) {
        p.l(r4, "path");
        this.f176033a = (long) (TimeUnit.SECONDS.toMicros(1) / r5);
        this.f176034b = new MediaMuxer(r4, 0);
    }

    public long a() {
        if (this.f176036e != 0) goto L7;
        return 0;
    L7:
        return TimeUnit.MILLISECONDS.convert(this.f176037f + this.f176033a, TimeUnit.MICROSECONDS);
    }

    public boolean b() {
        return this.f176035c;
    }

    public void c(ByteBuffer r5, MediaCodec.BufferInfo r6) {
        p.l(r5, "encodedData");
        p.l(r6, "bufferInfo");
        long r02 = this.f176033a;
        int r2 = this.f176036e;
        this.f176036e = r2 + 1;
        long r03 = r02 * r2;
        this.f176037f = r03;
        r6.presentationTimeUs = r03;
        this.f176034b.writeSampleData(this.d, r5, r6);
    }

    public void d() {
        this.f176034b.stop();
        this.f176034b.release();
    }

    public void e(MediaFormat r2) {
        p.l(r2, "videoFormat");
        this.d = this.f176034b.addTrack(r2);
        this.f176034b.start();
        this.f176035c = true;
    }
}
