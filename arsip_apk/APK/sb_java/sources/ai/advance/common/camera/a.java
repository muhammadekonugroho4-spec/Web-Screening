package ai.advance.common.camera;

import ai.advance.common.utils.d;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class a {

    /* renamed from: A, reason: collision with root package name */
    public int f1700A;

    /* renamed from: B, reason: collision with root package name */
    public long f1701B;

    /* renamed from: C, reason: collision with root package name */
    public long f1702C;

    /* renamed from: D, reason: collision with root package name */
    public String f1703D;

    /* renamed from: E, reason: collision with root package name */
    public String f1704E;

    /* renamed from: F, reason: collision with root package name */
    public JSONArray f1705F;

    /* renamed from: a, reason: collision with root package name */
    public int f1706a;

    /* renamed from: b, reason: collision with root package name */
    public int f1707b;

    /* renamed from: c, reason: collision with root package name */
    public int f1708c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1709e;

    /* renamed from: f, reason: collision with root package name */
    public int f1710f;

    /* renamed from: g, reason: collision with root package name */
    public int f1711g;

    /* renamed from: h, reason: collision with root package name */
    public int f1712h;

    /* renamed from: i, reason: collision with root package name */
    public File f1713i;

    /* renamed from: j, reason: collision with root package name */
    public d f1714j;

    /* renamed from: k, reason: collision with root package name */
    public d f1715k;

    /* renamed from: l, reason: collision with root package name */
    public d f1716l;

    /* renamed from: m, reason: collision with root package name */
    public d f1717m;

    /* renamed from: n, reason: collision with root package name */
    public C0005a f1718n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicInteger f1719o;

    /* renamed from: p, reason: collision with root package name */
    public MediaCodec f1720p;

    /* renamed from: q, reason: collision with root package name */
    public MediaMuxer f1721q;

    /* renamed from: r, reason: collision with root package name */
    public ConcurrentLinkedQueue f1722r;

    /* renamed from: s, reason: collision with root package name */
    public ConcurrentLinkedQueue f1723s;

    /* renamed from: t, reason: collision with root package name */
    public volatile boolean f1724t;

    /* renamed from: u, reason: collision with root package name */
    public int f1725u;

    /* renamed from: v, reason: collision with root package name */
    public int f1726v;

    /* renamed from: w, reason: collision with root package name */
    public Integer f1727w;

    /* renamed from: x, reason: collision with root package name */
    public int f1728x;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicInteger f1729y;

    /* renamed from: z, reason: collision with root package name */
    public int f1730z;

    /* renamed from: ai.advance.common.camera.a$a, reason: collision with other inner class name */
    public class C0005a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f1731a;

        public C0005a(a r1) {
            this.f1731a = r1;
            super("video_recorder_thread");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            long r02 = System.currentTimeMillis();
        L4:
            if (this.f1731a.f1724t == false) goto L11;
            long r2 = System.currentTimeMillis();     // Catch: Exception -> L13
            c r4 = (c) this.f1731a.f1722r.poll();     // Catch: Exception -> L13
            if (r4 == null) goto L8;
            System.currentTimeMillis();     // Catch: Exception -> L13
            System.currentTimeMillis();     // Catch: Exception -> L13
            System.currentTimeMillis();     // Catch: Exception -> L13
            a.b(this.f1731a, r4);     // Catch: Exception -> L13
            System.currentTimeMillis();     // Catch: Exception -> L13
            this.f1731a.f1714j.a((int) (System.currentTimeMillis() - r2));     // Catch: Exception -> L13
        L8:
            long r22 = System.currentTimeMillis() - r02;
            a r42 = this.f1731a;
            if (r22 < r42.f1712h) goto L4;
            r42.h();
            goto L4
        L11:
            super.run();
        }
    }

    public a() {
        this.f1706a = 10;
        this.f1707b = 200000;
        this.f1708c = 30;
        this.f1709e = 1;
        this.f1700A = 0;
        this.f1722r = new ConcurrentLinkedQueue();
        this.f1723s = new ConcurrentLinkedQueue();
        this.f1719o = new AtomicInteger();
        this.f1714j = new d();
        this.f1716l = new d();
        this.f1715k = new d();
        this.f1717m = new d();
        this.f1729y = new AtomicInteger();
    }

    public static /* synthetic */ void b(a r02, c r1) {
        r02.c(r1);
    }

    public void a() {
        MediaCodec r02 = this.f1720p;     // Catch: Exception -> L10
        if (r02 == null) goto L14;
        r02.release();     // Catch: Exception -> L10
    L14:
        MediaMuxer r03 = this.f1721q;     // Catch: Exception -> L11
        if (r03 == null) goto L8;
        r03.stop();     // Catch: Exception -> L11
        this.f1721q.release();     // Catch: Exception -> L11
    L8:
        this.f1722r.clear();
        this.f1723s.clear();
    }

    public final void c(c r14) {
        if (this.f1725u != 0) goto L6;
        this.f1701B = r14.f1733b;
    L6:
        if ((r14.f1733b - this.f1701B) >= this.f1702C) goto L9;
        this.f1729y.incrementAndGet();
        return;
    L9:
        byte[] r02 = r14.a();
        long r1 = System.currentTimeMillis();
        int r7 = this.f1720p.dequeueInputBuffer(200000);
        this.f1715k.a((int) (System.currentTimeMillis() - r1));
        long r10 = (r14.f1733b - this.f1701B) * 1000;
        if (r10 < 0) goto L37;
        if (r7 < 0) goto L17;
        ByteBuffer r12 = this.f1720p.getInputBuffer(r7);
        if (r12 == null) goto L16;
        r12.clear();
        r12.put(r02);
    L16:
        this.f1720p.queueInputBuffer(r7, 0, r02.length, r10, 0);
    L17:
        MediaCodec.BufferInfo r03 = new MediaCodec.BufferInfo();
        long r13 = System.currentTimeMillis();
        int r3 = this.f1720p.dequeueOutputBuffer(r03, 200000);
        this.f1716l.a((int) (System.currentTimeMillis() - r13));
        if (r3 < 0) goto L28;
        long r15 = System.currentTimeMillis();
        ByteBuffer r4 = this.f1720p.getOutputBuffer(r3);
        if (r4 != null) goto L22;
        return;
    L22:
        r4.position(r03.offset);
        r4.limit(r03.offset + r03.size);
        Integer r5 = this.f1727w;
        if (r5 == null) goto L25;
        this.f1721q.writeSampleData(r5.intValue(), r4, r03);
    L25:
        this.f1720p.releaseOutputBuffer(r3, false);
        this.f1717m.a((int) (System.currentTimeMillis() - r15));
        this.f1725u++;
        this.f1702C = r14.f1733b - this.f1701B;
        return;
    L28:
        if (r3 != (-2)) goto L30;
        this.f1727w = Integer.valueOf(this.f1721q.addTrack(this.f1720p.getOutputFormat()));
        this.f1721q.start();
        return;
    L30:
        if (r3 == (-1)) goto L33;
        this.f1726v++;
        return;
    L33:
        this.f1719o.incrementAndGet();
        return;
    }

    public void d(c r3) {
        if (this.f1724t == true) goto L5;
        return;
    L5:
        if (this.f1722r.size() <= this.f1706a) goto L7;
        this.f1722r.poll();
        this.f1700A++;
    L7:
        this.f1722r.add(r3);
    }

    public void e(int r1) {
        this.f1707b = r1;
    }

    public void f(int r1) {
        this.d = r1;
    }

    public void g(int r2, int r3, int r4, File r5) {
        this.f1710f = r2;
        this.f1711g = r3;
        this.f1712h = r4;
        this.f1713i = r5;
        if (r5.exists() == false) goto L14;
        this.f1713i.delete();
    L14:
        MediaMuxer r42 = new MediaMuxer(this.f1713i.getCanonicalPath(), 0);     // Catch: Exception -> L13
        this.f1721q = r42;     // Catch: Exception -> L13
        r42.setOrientationHint(this.d);     // Catch: Exception -> L13
        MediaCodecInfo r52 = b.b("video/avc");
        if (r52 == null) goto L16;
        this.f1728x = b.a(r52, this.f1730z, "video/avc");
        this.f1720p = MediaCodec.createByCodecName(r52.getName());     // Catch: Exception -> L13
        MediaFormat r22 = MediaFormat.createVideoFormat("video/avc", r2, r3);
        r22.setInteger("bitrate", this.f1707b);
        r22.setInteger("frame-rate", this.f1708c);
        r22.setInteger("color-format", this.f1728x);
        r22.setInteger("i-frame-interval", 1);
        this.f1704E = r22.toString();
        this.f1703D = r52.getName();
        this.f1705F = b.c(r52, "video/avc");
        this.f1720p.configure(r22, null, null, 1);
        this.f1720p.start();
        this.f1724t = true;
        C0005a r23 = new C0005a(this);
        this.f1718n = r23;
        r23.start();
        return;
    L16:
        return;
    }

    public synchronized void h() {
        monitor-enter(this);
    L16:
        th = move-exception;
        throw th;
    L4:
        if (this.f1724t == true) goto L8;
        monitor-exit(this);
        return;
    L8:
        this.f1724t = false;     // Catch: Throwable -> L16
        if (this.f1720p != null) goto L11;
    L18:
        a();     // Catch: Throwable -> L16
        monitor-exit(this);
        return;
    L11:
        if (this.f1721q == null) goto L18;
        C0005a r02 = this.f1718n;     // Catch: Throwable -> L16 Exception -> L23
        if (r02 == null) goto L18;
        r02.join();     // Catch: Throwable -> L16 Exception -> L23
        this.f1718n = null;     // Catch: Throwable -> L16 Exception -> L23
        goto L18
    }
}
