package com.github.barteksc.pdfviewer;

import android.graphics.RectF;
import com.github.barteksc.pdfviewer.util.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final PriorityQueue f37434a;

    /* renamed from: b, reason: collision with root package name */
    public final PriorityQueue f37435b;

    /* renamed from: c, reason: collision with root package name */
    public final List f37436c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final a f37437e;

    public class a implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f37438a;

        public a(b r1) {
            this.f37438a = r1;
        }

        public int a(com.github.barteksc.pdfviewer.model.b r3, com.github.barteksc.pdfviewer.model.b r4) {
            if (r3.a() != r4.a()) goto L7;
            return 0;
        L7:
            if (r3.a() <= r4.a()) goto L10;
            return 1;
        L10:
            return -1;
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object r1, Object r2) {
            return a((com.github.barteksc.pdfviewer.model.b) r1, (com.github.barteksc.pdfviewer.model.b) r2);
        }
    }

    public b() {
        this.d = new Object();
        a r02 = new a(this);
        this.f37437e = r02;
        this.f37435b = new PriorityQueue(a.C0391a.f37538a, r02);
        this.f37434a = new PriorityQueue(a.C0391a.f37538a, r02);
        this.f37436c = new ArrayList();
    }

    public static com.github.barteksc.pdfviewer.model.b e(PriorityQueue r2, com.github.barteksc.pdfviewer.model.b r3) {
        Iterator r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L8;
        com.github.barteksc.pdfviewer.model.b r02 = (com.github.barteksc.pdfviewer.model.b) r22.next();
        if (r02.equals(r3) == false) goto L4;
        return r02;
    L8:
        return null;
    }

    public final void a(Collection r3, com.github.barteksc.pdfviewer.model.b r4) {
        Iterator r02 = r3.iterator();
    L4:
        if (r02.hasNext() == false) goto L9;
        if (((com.github.barteksc.pdfviewer.model.b) r02.next()).equals(r4) == false) goto L4;
        r4.d().recycle();
        return;
    L9:
        r3.add(r4);
    }

    public void b(com.github.barteksc.pdfviewer.model.b r3) {
        Object r02 = this.d;
        monitor-enter(r02);
        h();     // Catch: Throwable -> L7
        this.f37435b.offer(r3);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void c(com.github.barteksc.pdfviewer.model.b r4) {
        List r02 = this.f37436c;
        monitor-enter(r02);
    L14:
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.f37436c.size() < a.C0391a.f37539b) goto L9;
        ((com.github.barteksc.pdfviewer.model.b) this.f37436c.remove(0)).d().recycle();     // Catch: Throwable -> L7
        goto L14
    L9:
        a(this.f37436c, r4);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
    }

    public boolean d(int r7, RectF r8) {
        com.github.barteksc.pdfviewer.model.b r02 = new com.github.barteksc.pdfviewer.model.b(r7, null, r8, true, 0);
        List r72 = this.f37436c;
        monitor-enter(r72);
        Iterator r82 = this.f37436c.iterator();     // Catch: Throwable -> L12
    L6:
        if (r82.hasNext() == false) goto L15;
        if (((com.github.barteksc.pdfviewer.model.b) r82.next()).equals(r02) == false) goto L6;
        monitor-exit(r72);     // Catch: Throwable -> L12
        return true;
    L15:
        monitor-exit(r72);     // Catch: Throwable -> L12
        return false;
    L12:
        th = move-exception;
        throw th;
    }

    public List f() {
        Object r02 = this.d;
        monitor-enter(r02);
        ArrayList r1 = new ArrayList(this.f37434a);     // Catch: Throwable -> L7
        r1.addAll(this.f37435b);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public List g() {
        List r02 = this.f37436c;
        monitor-enter(r02);
        List r1 = this.f37436c;     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public final void h() {
        Object r02 = this.d;
        monitor-enter(r02);
    L20:
    L9:
        th = move-exception;
        throw th;
    L5:
        if ((this.f37435b.size() + this.f37434a.size()) < a.C0391a.f37538a) goto L12;
        if (this.f37434a.isEmpty() == true) goto L12;
        ((com.github.barteksc.pdfviewer.model.b) this.f37434a.poll()).d().recycle();     // Catch: Throwable -> L9
    L12:
        if ((this.f37435b.size() + this.f37434a.size()) < a.C0391a.f37538a) goto L16;
        if (this.f37435b.isEmpty() == true) goto L16;
        ((com.github.barteksc.pdfviewer.model.b) this.f37435b.poll()).d().recycle();     // Catch: Throwable -> L9
    L16:
        monitor-exit(r02);     // Catch: Throwable -> L9
    }

    public void i() {
        Object r02 = this.d;
        monitor-enter(r02);
        this.f37434a.addAll(this.f37435b);     // Catch: Throwable -> L7
        this.f37435b.clear();     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void j() {
        Object r02 = this.d;
        monitor-enter(r02);
        Iterator r1 = this.f37434a.iterator();     // Catch: Throwable -> L8
    L6:
        if (r1.hasNext() == false) goto L10;
        ((com.github.barteksc.pdfviewer.model.b) r1.next()).d().recycle();     // Catch: Throwable -> L8
        goto L6
    L10:
        this.f37434a.clear();     // Catch: Throwable -> L8
        Iterator r12 = this.f37435b.iterator();     // Catch: Throwable -> L8
    L12:
        if (r12.hasNext() == false) goto L14;
        ((com.github.barteksc.pdfviewer.model.b) r12.next()).d().recycle();     // Catch: Throwable -> L8
        goto L12
    L14:
        this.f37435b.clear();     // Catch: Throwable -> L8
        monitor-exit(r02);     // Catch: Throwable -> L8
        List r13 = this.f37436c;
        monitor-enter(r13);
        Iterator r03 = this.f37436c.iterator();     // Catch: Throwable -> L22
    L20:
        if (r03.hasNext() == false) goto L24;
        ((com.github.barteksc.pdfviewer.model.b) r03.next()).d().recycle();     // Catch: Throwable -> L22
        goto L20
    L24:
        this.f37436c.clear();     // Catch: Throwable -> L22
        monitor-exit(r13);     // Catch: Throwable -> L22
        return;
    L22:
        th = move-exception;
        throw th;
    L8:
        th = move-exception;
        throw th;
    }

    public boolean k(int r7, RectF r8, int r9) {
        com.github.barteksc.pdfviewer.model.b r02 = new com.github.barteksc.pdfviewer.model.b(r7, null, r8, false, 0);
        Object r72 = this.d;
        monitor-enter(r72);
        com.github.barteksc.pdfviewer.model.b r82 = e(this.f37434a, r02);     // Catch: Throwable -> L9
        boolean r1 = true;
        if (r82 == null) goto L12;
        this.f37434a.remove(r82);     // Catch: Throwable -> L9
        r82.f(r9);     // Catch: Throwable -> L9
        this.f37435b.offer(r82);     // Catch: Throwable -> L9
        monitor-exit(r72);     // Catch: Throwable -> L9
        return true;
    L12:
        if (e(this.f37435b, r02) != null) goto L15;
        r1 = false;
    L15:
        monitor-exit(r72);     // Catch: Throwable -> L9
        return r1;
    L9:
        th = move-exception;
        throw th;
    }
}
