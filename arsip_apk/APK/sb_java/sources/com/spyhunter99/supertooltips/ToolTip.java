package com.spyhunter99.supertooltips;

import android.graphics.Typeface;
import android.view.View;

/* loaded from: classes6.dex */
public class ToolTip {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f44236a;

    /* renamed from: b, reason: collision with root package name */
    public int f44237b;

    /* renamed from: c, reason: collision with root package name */
    public int f44238c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public View f44239e;

    /* renamed from: f, reason: collision with root package name */
    public AnimationType f44240f;

    /* renamed from: g, reason: collision with root package name */
    public Position f44241g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f44242h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f44243i;

    /* renamed from: j, reason: collision with root package name */
    public Typeface f44244j;

    /* renamed from: k, reason: collision with root package name */
    public int f44245k;

    public enum AnimationType extends Enum<AnimationType> {
        public static final AnimationType FROM_MASTER_VIEW = null;
        public static final AnimationType FROM_TOP = null;
        public static final AnimationType NONE = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ AnimationType[] f44246a = null;

        static {
            AnimationType r02 = new AnimationType("FROM_MASTER_VIEW", 0);
            FROM_MASTER_VIEW = r02;
            AnimationType r1 = new AnimationType("FROM_TOP", 1);
            FROM_TOP = r1;
            AnimationType r2 = new AnimationType("NONE", 2);
            NONE = r2;
            f44246a = new AnimationType[]{r02, r1, r2};
        }

        AnimationType(String r1, int r2) {
        }

        public static AnimationType valueOf(String r1) {
            return (AnimationType) Enum.valueOf(AnimationType.class, r1);
        }

        public static AnimationType[] values() {
            return (AnimationType[]) f44246a.clone();
        }
    }

    public enum Position extends Enum<Position> {
        public static final Position CENTER = null;
        public static final Position LEFT = null;
        public static final Position RIGHT = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Position[] f44247a = null;

        static {
            Position r02 = new Position("LEFT", 0);
            LEFT = r02;
            Position r1 = new Position("CENTER", 1);
            CENTER = r1;
            Position r2 = new Position("RIGHT", 2);
            RIGHT = r2;
            f44247a = new Position[]{r02, r1, r2};
        }

        Position(String r1, int r2) {
        }

        public static Position valueOf(String r1) {
            return (Position) Enum.valueOf(Position.class, r1);
        }

        public static Position[] values() {
            return (Position[]) f44247a.clone();
        }
    }

    public ToolTip() {
        this.f44236a = null;
        this.f44244j = null;
        this.f44237b = 0;
        this.f44238c = 0;
        this.f44239e = null;
        this.f44242h = false;
        this.f44240f = AnimationType.FROM_MASTER_VIEW;
        this.f44241g = Position.CENTER;
        this.f44245k = 0;
    }

    public AnimationType a() {
        return this.f44240f;
    }

    public int b() {
        return this.f44238c;
    }

    public View c() {
        return this.f44239e;
    }

    public Position d() {
        return this.f44241g;
    }

    public boolean e() {
        return this.f44242h;
    }

    public CharSequence f() {
        return this.f44236a;
    }

    public int g() {
        return this.d;
    }

    public int h() {
        return this.f44237b;
    }

    public Typeface i() {
        return this.f44244j;
    }

    public boolean j() {
        return this.f44243i;
    }

    public ToolTip k(AnimationType r1) {
        this.f44240f = r1;
        return this;
    }

    public ToolTip l(int r1) {
        this.f44238c = r1;
        return this;
    }

    public ToolTip m(View r1) {
        this.f44239e = r1;
        return this;
    }

    public ToolTip n(Position r1) {
        this.f44241g = r1;
        return this;
    }

    public ToolTip o() {
        this.f44243i = true;
        return this;
    }

    public ToolTip p() {
        this.f44242h = true;
        return this;
    }

    public ToolTip q(CharSequence r1) {
        this.f44236a = r1;
        this.f44237b = 0;
        return this;
    }

    public ToolTip r(int r1) {
        this.d = r1;
        return this;
    }
}
