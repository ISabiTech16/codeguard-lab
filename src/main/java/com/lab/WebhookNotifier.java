package com.lab;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class WebhookNotifier {

    /** Fetches a status page the caller points us at. */
    public byte[] fetchStatus(String url) throws IOException {
        try (InputStream in = new URL(url).openStream()) {
            return in.readAllBytes();
        }
    }
}
