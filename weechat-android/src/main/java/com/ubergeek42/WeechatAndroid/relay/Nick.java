/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 */

package com.ubergeek42.WeechatAndroid.relay;

public class Nick {
    public final long pointer;
    public String prefix;
    public String name;

    public Nick(long pointer, String prefix, String name) {
        this.prefix = prefix;
        this.name = name;
        this.pointer = pointer;
    }
}
