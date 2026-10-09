package com.shockwave.pdfium;

import android.graphics.RectF;
import android.os.ParcelFileDescriptor;
import androidx.collection.C2337a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class PdfDocument {

    /* renamed from: a, reason: collision with root package name */
    public long f43905a;

    /* renamed from: b, reason: collision with root package name */
    public ParcelFileDescriptor f43906b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f43907c;

    public static class Bookmark {

        /* renamed from: a, reason: collision with root package name */
        public List f43908a;

        /* renamed from: b, reason: collision with root package name */
        public String f43909b;

        /* renamed from: c, reason: collision with root package name */
        public long f43910c;
        public long d;

        public Bookmark() {
            this.f43908a = new ArrayList();
        }

        public List a() {
            return this.f43908a;
        }
    }

    public static class Link {

        /* renamed from: a, reason: collision with root package name */
        public RectF f43911a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f43912b;

        /* renamed from: c, reason: collision with root package name */
        public String f43913c;

        public Link(RectF r1, Integer r2, String r3) {
            this.f43911a = r1;
            this.f43912b = r2;
            this.f43913c = r3;
        }

        public RectF a() {
            return this.f43911a;
        }

        public Integer b() {
            return this.f43912b;
        }

        public String c() {
            return this.f43913c;
        }
    }

    public static class Meta {

        /* renamed from: a, reason: collision with root package name */
        public String f43914a;

        /* renamed from: b, reason: collision with root package name */
        public String f43915b;

        /* renamed from: c, reason: collision with root package name */
        public String f43916c;
        public String d;

        /* renamed from: e, reason: collision with root package name */
        public String f43917e;

        /* renamed from: f, reason: collision with root package name */
        public String f43918f;

        /* renamed from: g, reason: collision with root package name */
        public String f43919g;

        /* renamed from: h, reason: collision with root package name */
        public String f43920h;

        public Meta() {
        }
    }

    public PdfDocument() {
        this.f43907c = new C2337a();
    }
}
