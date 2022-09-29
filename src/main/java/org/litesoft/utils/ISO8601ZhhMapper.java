package org.litesoft.utils;

import java.time.Instant;

/**
 * Mapper that bidirectionally converts a ISO-8601(ish) timestamp String to/from an Instant with timestamp resolution of: Hour
 * <p>
 * Note: All String outputs are in Zulu/UTC and conforms with the rules defined in <code>ISO8601ZtimeStamp</code>!
 */
@SuppressWarnings("unused")
public class ISO8601ZhhMapper extends AbstractISO8601Zmapper {
    public static final ISO8601ZhhMapper INSTANCE = new ISO8601ZhhMapper();

    private ISO8601ZhhMapper() {
        super( ISO8601ZtimeStamp::toHour );
    }

    public static String instantToString( Instant instant ) {
        return INSTANCE.from( instant );
    }

    public static Instant stringToInstant( String iso8601ish ) {
        return INSTANCE.from( iso8601ish );
    }

    public static String normalizeString( String iso8601ish ) {
        return INSTANCE.normalize( iso8601ish );
    }

    public static Instant normalizeInstant( Instant instant ) {
        return INSTANCE.normalize( instant );
    }
}
