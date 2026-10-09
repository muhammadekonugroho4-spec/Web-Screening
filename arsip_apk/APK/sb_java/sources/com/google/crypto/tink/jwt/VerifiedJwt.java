package com.google.crypto.tink.jwt;

import com.google.errorprone.annotations.Immutable;
import java.time.Instant;
import java.util.List;
import java.util.Set;

@Immutable
/* loaded from: classes6.dex */
public final class VerifiedJwt {
    private final RawJwt rawJwt;

    public VerifiedJwt(RawJwt r1) {
        this.rawJwt = r1;
    }

    public Set<String> customClaimNames() {
        return this.rawJwt.customClaimNames();
    }

    public List<String> getAudiences() throws JwtInvalidException {
        return this.rawJwt.getAudiences();
    }

    public Boolean getBooleanClaim(String r2) throws JwtInvalidException {
        return this.rawJwt.getBooleanClaim(r2);
    }

    public Instant getExpiration() throws JwtInvalidException {
        return this.rawJwt.getExpiration();
    }

    public Instant getIssuedAt() throws JwtInvalidException {
        return this.rawJwt.getIssuedAt();
    }

    public String getIssuer() throws JwtInvalidException {
        return this.rawJwt.getIssuer();
    }

    public String getJsonArrayClaim(String r2) throws JwtInvalidException {
        return this.rawJwt.getJsonArrayClaim(r2);
    }

    public String getJsonObjectClaim(String r2) throws JwtInvalidException {
        return this.rawJwt.getJsonObjectClaim(r2);
    }

    public String getJwtId() throws JwtInvalidException {
        return this.rawJwt.getJwtId();
    }

    public Instant getNotBefore() throws JwtInvalidException {
        return this.rawJwt.getNotBefore();
    }

    public Double getNumberClaim(String r2) throws JwtInvalidException {
        return this.rawJwt.getNumberClaim(r2);
    }

    public String getStringClaim(String r2) throws JwtInvalidException {
        return this.rawJwt.getStringClaim(r2);
    }

    public String getSubject() throws JwtInvalidException {
        return this.rawJwt.getSubject();
    }

    public String getTypeHeader() throws JwtInvalidException {
        return this.rawJwt.getTypeHeader();
    }

    public boolean hasAudiences() {
        return this.rawJwt.hasAudiences();
    }

    public boolean hasBooleanClaim(String r2) {
        return this.rawJwt.hasBooleanClaim(r2);
    }

    public boolean hasExpiration() {
        return this.rawJwt.hasExpiration();
    }

    public boolean hasIssuedAt() {
        return this.rawJwt.hasIssuedAt();
    }

    public boolean hasIssuer() {
        return this.rawJwt.hasIssuer();
    }

    public boolean hasJsonArrayClaim(String r2) {
        return this.rawJwt.hasJsonArrayClaim(r2);
    }

    public boolean hasJsonObjectClaim(String r2) {
        return this.rawJwt.hasJsonObjectClaim(r2);
    }

    public boolean hasJwtId() {
        return this.rawJwt.hasJwtId();
    }

    public boolean hasNotBefore() {
        return this.rawJwt.hasNotBefore();
    }

    public boolean hasNumberClaim(String r2) {
        return this.rawJwt.hasNumberClaim(r2);
    }

    public boolean hasStringClaim(String r2) {
        return this.rawJwt.hasStringClaim(r2);
    }

    public boolean hasSubject() {
        return this.rawJwt.hasSubject();
    }

    public boolean hasTypeHeader() {
        return this.rawJwt.hasTypeHeader();
    }

    public boolean isNullClaim(String r2) {
        return this.rawJwt.isNullClaim(r2);
    }

    public String toString() {
        return "verified{" + this.rawJwt + "}";
    }
}
