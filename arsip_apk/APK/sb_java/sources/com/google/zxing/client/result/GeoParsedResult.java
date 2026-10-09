package com.google.zxing.client.result;

/* loaded from: classes6.dex */
public final class GeoParsedResult extends ParsedResult {
    private final double altitude;
    private final double latitude;
    private final double longitude;
    private final String query;

    public GeoParsedResult(double r2, double r4, double r6, String r8) {
        super(ParsedResultType.GEO);
        this.latitude = r2;
        this.longitude = r4;
        this.altitude = r6;
        this.query = r8;
    }

    public double getAltitude() {
        return this.altitude;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder r02 = new StringBuilder(20);
        r02.append(this.latitude);
        r02.append(", ");
        r02.append(this.longitude);
        if (this.altitude <= 0.0d) goto L6;
        r02.append(", ");
        r02.append(this.altitude);
        r02.append('m');
    L6:
        if (this.query == null) goto L9;
        r02.append(" (");
        r02.append(this.query);
        r02.append(')');
    L9:
        return r02.toString();
    }

    public String getGeoURI() {
        StringBuilder r02 = new StringBuilder();
        r02.append("geo:");
        r02.append(this.latitude);
        r02.append(',');
        r02.append(this.longitude);
        if (this.altitude <= 0.0d) goto L6;
        r02.append(',');
        r02.append(this.altitude);
    L6:
        if (this.query == null) goto L9;
        r02.append('?');
        r02.append(this.query);
    L9:
        return r02.toString();
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getQuery() {
        return this.query;
    }
}
