/*
 * Copyright 2024-2025 Embabel Software, Inc.
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
package com.embabel.common.core.types

/**
 * Implemented by classes that can expose human-readable information about themselves
 */
interface HasInfoString {

    /**
     * Human-readable String representation of the object
     * @param verbose if true, include more detailed information
     * @param indent the number of tabs to indent the string
     */
    fun infoString(
      verbose: Boolean? = false,
      indent: Int = 0,
    ): String
}
