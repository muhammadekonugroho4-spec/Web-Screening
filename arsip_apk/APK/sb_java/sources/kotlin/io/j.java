package kotlin.io;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public final class j implements kotlin.sequences.i {

    /* renamed from: a, reason: collision with root package name */
    public final BufferedReader f177476a;

    public static final class a implements Iterator, kotlin.jvm.internal.markers.a {

        /* renamed from: a, reason: collision with root package name */
        public String f177477a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f177478b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f177479c;

        public a(j r1) {
            this.f177479c = r1;
        }

        public String a() {
            if (hasNext() == false) goto L7;
            String r02 = this.f177477a;
            this.f177477a = null;
            p.i(r02);
            return r02;
        L7:
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f177477a != null) goto L10;
            if (this.f177478b == true) goto L10;
            String r02 = j.c(this.f177479c).readLine();
            this.f177477a = r02;
            if (r02 != null) goto L10;
            this.f177478b = true;
        L10:
            if (this.f177477a == null) goto L12;
            return true;
        L12:
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return a();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public j(BufferedReader r2) {
        p.l(r2, "reader");
        this.f177476a = r2;
    }

    public static final /* synthetic */ BufferedReader c(j r02) {
        return r02.f177476a;
    }

    @Override // kotlin.sequences.i
    public Iterator iterator() {
        return new a(this);
    }
}
