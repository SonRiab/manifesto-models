/*
 * SPDX short identifier: MIT
 *
 * MIT License
 *
 * Copyright (c) 2018 Rene Jablonski
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
package de.vnull.manifestoproject.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public abstract class Code {

    @Id
    @GeneratedValue
    private Long id;

    /**
     * Store the "md5sum_text" value used by the Manifesto Project.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    private MetadataVersion metadataVersion;

    /**
     * Store the "md5sum_text" value used by the Manifesto Project.
     */
    private String identifier;

    /**
     * Store the "md5sum_text" value used by the Manifesto Project.
     */
    private String name;

    /**
     * Store the "md5sum_text" value used by the Manifesto Project.
     */
    private String description;

    /**
     * Store the "md5sum_text" value used by the Manifesto Project.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    private Code parentCode;
}
