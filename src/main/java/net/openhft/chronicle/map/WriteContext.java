/*
 * Copyright 2014 Higher Frequency Trading
 *
 * http://www.higherfrequencytrading.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.openhft.chronicle.map;

/**
 * @author Rob Austin.
 */
public interface WriteContext<K, V> extends Context<K, V> {

    /**
     * Prevents the entry being put back back into the map when the Context is closed
     *
     * @throws java.lang.IllegalArgumentException if used in a native context
     */
    void dontPutOnClose();

    /**
     * this is similar by more efficient than calling map.remove("key") as the entry is already
     * available to the WriteContext
     */
    void removeEntry();

    /**
     * @return true if the entry was previously present
     */
    boolean created();

}
