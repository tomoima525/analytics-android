/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Segment.io, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.segment.android.internal.payload;

import com.segment.android.AnalyticsContext;
import com.segment.android.Options;
import com.segment.android.Properties;

public class ScreenPayload extends BasePayload {
  /** The category of the page or screen. We recommend using title case, like Docs. */
  private static final String CATEGORY_KEY = "category";

  /** The name of the page or screen. We recommend using title case, like About. */
  private static final String NAME_KEY = "name";

  /** The page and screen methods also take a properties dictionary, just like track. */
  private static final String PROPERTIES_KEY = "properties";

  public ScreenPayload(String anonymousId, AnalyticsContext context, String userId, String category,
      String name, Properties properties, Options options) {
    super(Type.screen, anonymousId, context, userId, options);
    put(CATEGORY_KEY, category);
    put(NAME_KEY, name);
    put(PROPERTIES_KEY, properties);
  }

  public String getCategory() {
    return getString(CATEGORY_KEY);
  }

  public String getName() {
    return getString(NAME_KEY);
  }

  public Properties getProperties() {
    return (Properties) get(PROPERTIES_KEY);
  }
}