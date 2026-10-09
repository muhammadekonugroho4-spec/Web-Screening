package com.koushikdutta.async;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;

/* loaded from: classes6.dex */
public class y implements com.koushikdutta.async.callback.c {

    /* renamed from: n, reason: collision with root package name */
    public static Hashtable f41680n;

    /* renamed from: a, reason: collision with root package name */
    public l f41681a;

    /* renamed from: b, reason: collision with root package name */
    public l f41682b;

    /* renamed from: c, reason: collision with root package name */
    public l f41683c;
    public l d;

    /* renamed from: e, reason: collision with root package name */
    public l f41684e;

    /* renamed from: f, reason: collision with root package name */
    public j f41685f;

    /* renamed from: g, reason: collision with root package name */
    public j f41686g;

    /* renamed from: h, reason: collision with root package name */
    public j f41687h;

    /* renamed from: i, reason: collision with root package name */
    public q f41688i;

    /* renamed from: j, reason: collision with root package name */
    public LinkedList f41689j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f41690k;

    /* renamed from: l, reason: collision with root package name */
    public ByteOrder f41691l;

    /* renamed from: m, reason: collision with root package name */
    public o f41692m;

    public class a extends l {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y f41693b;

        public a(y r1, int r2) {
            this.f41693b = r1;
            super(r2);
        }

        @Override // com.koushikdutta.async.y.l
        public l a(q r1, o r2) {
            y.a(this.f41693b).add(null);
            return null;
        }
    }

    public class b extends l {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y f41694b;

        public b(y r1, int r2) {
            this.f41694b = r1;
            super(r2);
        }

        @Override // com.koushikdutta.async.y.l
        public l a(q r1, o r2) {
            y.a(this.f41694b).add(Byte.valueOf(r2.e()));
            return null;
        }
    }

    public class c extends l {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y f41695b;

        public c(y r1, int r2) {
            this.f41695b = r1;
            super(r2);
        }

        @Override // com.koushikdutta.async.y.l
        public l a(q r1, o r2) {
            y.a(this.f41695b).add(Short.valueOf(r2.p()));
            return null;
        }
    }

    public class d extends l {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y f41696b;

        public d(y r1, int r2) {
            this.f41696b = r1;
            super(r2);
        }

        @Override // com.koushikdutta.async.y.l
        public l a(q r1, o r2) {
            y.a(this.f41696b).add(Integer.valueOf(r2.m()));
            return null;
        }
    }

    public class e extends l {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y f41697b;

        public e(y r1, int r2) {
            this.f41697b = r1;
            super(r2);
        }

        @Override // com.koushikdutta.async.y.l
        public l a(q r3, o r4) {
            y.a(this.f41697b).add(Long.valueOf(r4.n()));
            return null;
        }
    }

    public class f implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y f41698a;

        public f(y r1) {
            this.f41698a = r1;
        }

        @Override // com.koushikdutta.async.y.j
        public /* bridge */ /* synthetic */ void a(Object r1) {
            b((byte[]) r1);
        }

        public void b(byte[] r2) {
            y.a(this.f41698a).add(r2);
        }
    }

    public class g implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y f41699a;

        public g(y r1) {
            this.f41699a = r1;
        }

        @Override // com.koushikdutta.async.y.j
        public /* bridge */ /* synthetic */ void a(Object r1) {
            b((o) r1);
        }

        public void b(o r2) {
            y.a(this.f41699a).add(r2);
        }
    }

    public class h implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y f41700a;

        public h(y r1) {
            this.f41700a = r1;
        }

        @Override // com.koushikdutta.async.y.j
        public /* bridge */ /* synthetic */ void a(Object r1) {
            b((byte[]) r1);
        }

        public void b(byte[] r3) {
            y.a(this.f41700a).add(new String(r3));
        }
    }

    public static class i extends l {

        /* renamed from: b, reason: collision with root package name */
        public j f41701b;

        public i(int r1, j r2) {
            super(r1);
            if (r1 <= 0) goto L7;
            this.f41701b = r2;
            return;
        L7:
            throw new IllegalArgumentException("length should be > 0");
        }

        @Override // com.koushikdutta.async.y.l
        public l a(q r1, o r2) {
            byte[] r12 = new byte[this.f41704a];
            r2.h(r12);
            this.f41701b.a(r12);
            return null;
        }
    }

    public interface j {
        void a(Object r1);
    }

    public static class k extends l {

        /* renamed from: b, reason: collision with root package name */
        public byte f41702b;

        /* renamed from: c, reason: collision with root package name */
        public com.koushikdutta.async.callback.c f41703c;

        public k(byte r2, com.koushikdutta.async.callback.c r3) {
            super(1);
            this.f41702b = r2;
            this.f41703c = r3;
        }

        @Override // com.koushikdutta.async.y.l
        public l a(q r8, o r9) {
            o r02 = new o();
            boolean r2 = true;
        L4:
            if (r9.B() <= 0) goto L18;
            ByteBuffer r3 = r9.A();
            r3.mark();
            int r5 = 0;
        L7:
            if (r3.remaining() <= 0) goto L14;
            if (r3.get() != this.f41702b) goto L11;
            r2 = true;
        L12:
            if (r2 == true) goto L14;
            r5 = r5 + 1;
            goto L7
        L11:
            r2 = false;
        L14:
            r3.reset();
            if (r2 == true) goto L16;
            r02.a(r3);
            goto L4
        L16:
            r9.c(r3);
            r9.g(r02, r5);
            r9.e();
        L18:
            this.f41703c.q(r8, r02);
            if (r2 == false) goto L22;
            return null;
        L22:
            return this;
        }
    }

    public static abstract class l {

        /* renamed from: a, reason: collision with root package name */
        public int f41704a;

        public l(int r1) {
            this.f41704a = r1;
        }

        public abstract l a(q r1, o r2);
    }

    static {
        f41680n = new Hashtable();
    }

    public y(q r3) {
        this.f41681a = new a(this, 0);
        this.f41682b = new b(this, 1);
        this.f41683c = new c(this, 2);
        this.d = new d(this, 4);
        this.f41684e = new e(this, 8);
        this.f41685f = new f(this);
        this.f41686g = new g(this);
        this.f41687h = new h(this);
        this.f41689j = new LinkedList();
        this.f41690k = new ArrayList();
        this.f41691l = ByteOrder.BIG_ENDIAN;
        this.f41692m = new o();
        this.f41688i = r3;
        r3.x(this);
    }

    public static /* synthetic */ ArrayList a(y r02) {
        return r02.f41690k;
    }

    public y b(int r3, j r4) {
        this.f41689j.add(new i(r3, r4));
        return this;
    }

    public y c(byte r3, com.koushikdutta.async.callback.c r4) {
        this.f41689j.add(new k(r3, r4));
        return this;
    }

    @Override // com.koushikdutta.async.callback.c
    public void q(q r3, o r4) {
        r4.f(this.f41692m);
    L4:
        if (this.f41689j.size() <= 0) goto L11;
        if (this.f41692m.z() < ((l) this.f41689j.peek()).f41704a) goto L11;
        this.f41692m.t(this.f41691l);
        l r02 = ((l) this.f41689j.poll()).a(r3, this.f41692m);
        if (r02 == null) goto L4;
        this.f41689j.addFirst(r02);
    L11:
        if (this.f41689j.size() != 0) goto L20;
        this.f41692m.f(r4);
        return;
    }
}
