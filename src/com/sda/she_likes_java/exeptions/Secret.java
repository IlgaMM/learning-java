package com.sda.she_likes_java.exeptions;

import java.time.LocalDateTime;
import java.util.Objects;

public class Secret {
    private LocalDateTime timestamp;
    private String outSecret;

    public Secret(LocalDateTime timestamp, String outSecret) {
        this.timestamp = timestamp;
        this.outSecret = outSecret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Secret secret = (Secret) o;
        return Objects.equals(timestamp, secret.timestamp) && Objects.equals(outSecret, secret.outSecret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, outSecret);
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getOutSecret() {
        return outSecret;
    }

    @Override
    public String toString() {
        return "Secret{" +
                "timestamp=" + timestamp +
                ", outSecret='" + outSecret + '\'' +
                '}';
    }
}
