/*
 * Licensed to David Pilato (the "Author") under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. Author licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package fr.pilato.spring.elasticsearch.xml;

import org.w3c.dom.Element;

/**
 * XML Parser helpers
 * Source from: http://www.java2s.com/Tutorial/Java/0440__XML/GetElementBooleanValue.htm
 */
public class XMLParserUtil {
    public static boolean getElementBooleanValue(Element element, String attribute) {
        return getElementBooleanValue(element, attribute, false);
    }

    public static boolean getElementBooleanValue(Element element, String attribute, boolean defaultValue) {
        if (!element.hasAttribute(attribute)) return defaultValue;
        return Boolean
                .valueOf(getElementStringValue(element, attribute))
                .booleanValue();
    }

    public static String getElementStringValue(Element element, String attribute) {
        return element.getAttribute(attribute);
    }
}
